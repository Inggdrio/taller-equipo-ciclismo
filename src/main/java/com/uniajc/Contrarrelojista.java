package com.uniajc;

/**
 * Clase Contrarrelojista.
 * Es un tipo de ciclista especializado en las pruebas contra el reloj,
 * donde cada corredor sale solo y compite contra el cronómetro.
 * Hereda todo lo de Ciclista y le agrega sus propios datos.
 */
public class Contrarrelojista extends Ciclista {

    // Velocidad máxima que alcanza el ciclista, medida en km/h
    private double velocidadMaxima;

    /**
     * Constructor del Contrarrelojista.
     * Con super(id, nombre) le pasamos al padre (Ciclista) los datos que él se encarga de guardar.
     */
    public Contrarrelojista(int id, String nombre, double velocidadMaxima) {
        super(id, nombre);
        this.velocidadMaxima = velocidadMaxima;
    }

    /**
     * Devuelve el tipo de ciclista.
     * Es obligatorio porque en Ciclista este método es abstracto.
     */
    @Override
    public String imprimirTipo() {
        return "Contrarrelojista";
    }

    /**
     * Imprime los datos del contrarrelojista.
     * Primero usamos el método del padre (datos base) y luego sumamos los datos propios.
     */
    @Override
    public void imprimirDatos() {
        super.imprimirDatos();
        System.out.println("Tipo: " + imprimirTipo());
        System.out.println("Velocidad máxima: " + velocidadMaxima + " km/h");
    }

    // Getter y setter de velocidadMaxima
    public double getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(double velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }
}