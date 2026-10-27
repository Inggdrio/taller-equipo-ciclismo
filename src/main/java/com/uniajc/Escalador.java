package com.uniajc;

/**
 * Clase Escalador.
 * Es un tipo de ciclista especializado en subir montañas y pendientes.
 * Hereda todo lo de Ciclista y le agrega sus propios datos.
 */
public class Escalador extends Ciclista {

    // Aceleración promedio del ciclista, medida en m/s2
    private float aceleracionPromedio;

    // Inclinación de la rampa que puede subir, medida en grados
    private float gradoRampa;

    /**
     * Constructor del Escalador.
     * Con super(id, nombre) le pasamos al padre (Ciclista) los datos que él se encarga de guardar.
     */
    public Escalador(int id, String nombre, float aceleracion, float grado) {
        super(id, nombre);
        this.aceleracionPromedio = aceleracion;
        this.gradoRampa = grado;
    }

    /**
     * Devuelve el tipo de ciclista.
     * Es obligatorio porque en Ciclista este método es abstracto.
     */
    @Override
    public String imprimirTipo() {
        return "Escalador";
    }

    /**
     * Imprime los datos del escalador.
     * Primero usamos el método del padre (datos base) y luego sumamos los datos propios.
     */
    @Override
    public void imprimirDatos() {
        super.imprimirDatos();
        System.out.println("Tipo: " + imprimirTipo());
        System.out.println("Aceleración promedio: " + aceleracionPromedio + " m/s2");
        System.out.println("Grado de rampa: " + gradoRampa + " grados");
    }

    // Getter y setter de aceleracionPromedio
    public float getAceleracionPromedio() {
        return aceleracionPromedio;
    }

    public void setAceleracionPromedio(float aceleracionPromedio) {
        this.aceleracionPromedio = aceleracionPromedio;
    }

    // Getter y setter de gradoRampa
    public float getGradoRampa() {
        return gradoRampa;
    }

    public void setGradoRampa(float gradoRampa) {
        this.gradoRampa = gradoRampa;
    }
}