package com.uniajc;

import java.util.ArrayList;
import java.util.List;

// Equipo: agrupa un conjunto de ciclistas. Tiene nombre, pais y el tiempo
// total del equipo (que es static, compartido a nivel de clase).
public class Equipo {

    // Atributos privados
    private String nombreEquipo;
    private String pais;
    // static: la suma de tiempos es a nivel de clase, no de cada objeto
    private static int tiempoTotalEquipo;
    private List<Ciclista> ciclistas;

    // Constructor: inicializa nombre, pais y la lista vacia de ciclistas
    public Equipo(String nombreEquipo, String pais) {
        this.nombreEquipo = nombreEquipo;
        this.pais = pais;
        this.ciclistas = new ArrayList<>();
    }

    // Agrega un ciclista al equipo y suma su tiempo al total (static)
    public void anadirCiclista(Ciclista ciclista) {
        if (ciclista != null) {
            ciclistas.add(ciclista);
            tiempoTotalEquipo += ciclista.getTiempoAcumulado();
        }
    }

    // Muestra los datos generales del equipo
    public void imprimirDatosEquipo() {
        System.out.println("==============================");
        System.out.println("Equipo: " + nombreEquipo + " | Pais: " + pais);
        System.out.println("Cantidad de ciclistas: " + ciclistas.size());
        System.out.println("Tiempo total del equipo: " + tiempoTotalEquipo + " min");
        System.out.println("==============================");
    }

    // Lista solo los nombres de los ciclistas del equipo
    public void listarNombresCiclistas() {
        System.out.println("Ciclistas del equipo " + nombreEquipo + ":");
        for (Ciclista c : ciclistas) {
            System.out.println("- " + c.getNombre());
        }
    }

    // Busca un ciclista por su id y muestra sus datos
    public void imprimirDatosCiclistaPorId(int id) {
        for (Ciclista c : ciclistas) {
            if (c.getIdentificador() == id) {
                c.imprimirDatos();
                return;
            }
        }
        System.out.println("No se encontro un ciclista con id " + id);
    }


    public String getNombreEquipo() { return nombreEquipo; }
    public void setNombreEquipo(String nombreEquipo) { this.nombreEquipo = nombreEquipo; }

    public String getPais() { return pais; }
    public void setPais(String pais) { this.pais = pais; }

    public static int getTiempoTotalEquipo() { return tiempoTotalEquipo; }
    public static void setTiempoTotalEquipo(int tiempo) { tiempoTotalEquipo = tiempo; }

    public List<Ciclista> getCiclistas() { return ciclistas; }
}