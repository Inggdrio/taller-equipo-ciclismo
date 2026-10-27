package com.uniajc;

/**
 * Clase Velocista.
 * Es un tipo de ciclista especializado en los sprints (llegadas rápidas).
 * Hereda todo lo de Ciclista y le agrega sus propios datos.
 */
public class Velocista extends Ciclista {

    // Potencia promedio del ciclista, medida en vatios (W)
    private double potenciaPromedio;

    // Velocidad promedio que alcanza en los sprints, medida en km/h
    private double velocidadPromedioSprint;

    /**
     * Constructor del Velocista.
     * Con super(id, nombre) le pasamos al padre (Ciclista) los datos que él se encarga de guardar.
     */
    public Velocista(int id, String nombre, double potencia, double velocidad) {
        super(id, nombre);
        this.potenciaPromedio = potencia;
        this.velocidadPromedioSprint = velocidad;
    }

    /**
     * Devuelve el tipo de ciclista.
     * Obligatorio porque en Ciclista este método es abstracto.
     */
    @Override
    public String imprimirTipo() {
        return "Velocista";
    }

    /**
     * Imprime los datos del velocista.
     * Primero usamos el método del padre (datos base) y luego sumamos los datos propios.
     */
    @Override
    public void imprimirDatos() {
        super.imprimirDatos();
        System.out.println("Tipo: " + imprimirTipo());
        System.out.println("Potencia promedio: " + potenciaPromedio + " W");
        System.out.println("Velocidad promedio en sprint: " + velocidadPromedioSprint + " km/h");
    }

    // Getter y setter de potenciaPromedio
    public double getPotenciaPromedio() {
        return potenciaPromedio;
    }

    public void setPotenciaPromedio(double potenciaPromedio) {
        this.potenciaPromedio = potenciaPromedio;
    }

    // Getter y setter de velocidadPromedioSprint
    public double getVelocidadPromedioSprint() {
        return velocidadPromedioSprint;
    }

    public void setVelocidadPromedioSprint(double velocidadPromedioSprint) {
        this.velocidadPromedioSprint = velocidadPromedioSprint;
    }
}