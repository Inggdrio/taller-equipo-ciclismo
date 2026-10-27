package com.uniajc;

// Ciclista: clase abstracta. Es el molde base para los tipos de ciclista
// (Velocista, Escalador, Contrarrelojista). No se puede crear un Ciclista directo.
public abstract class Ciclista {

    // Atributos privados (encapsulados)
    private int identificador;
    private String nombre;
    private int tiempoAcumulado; // en minutos, arranca en 0

    // Constructor: recibe id y nombre; el tiempo acumulado inicia en 0
    public Ciclista(int identificador, String nombre) {
        this.identificador = identificador;
        this.nombre = nombre;
        this.tiempoAcumulado = 0;
    }

    // Método abstracto: cada tipo de ciclista dice qué es (polimorfismo)
    public abstract String imprimirTipo();

    // Muestra los datos del ciclista en consola
    public void imprimirDatos() {
        System.out.println("ID: " + identificador
                + " | Nombre: " + nombre
                + " | Tipo: " + imprimirTipo()
                + " | Tiempo acumulado: " + tiempoAcumulado + " min");
    }

    // Getters y setters
    public int getIdentificador() { return identificador; }
    public void setIdentificador(int identificador) { this.identificador = identificador; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public int getTiempoAcumulado() { return tiempoAcumulado; }
    public void setTiempoAcumulado(int tiempoAcumulado) { this.tiempoAcumulado = tiempoAcumulado; }
}