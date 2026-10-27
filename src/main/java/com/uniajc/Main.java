package com.uniajc;

// Clase principal: arma un equipo, le agrega ciclistas de distintos tipos
// y muestra la informacion usando polimorfismo.
public class Main {
    public static void main(String[] args) {

        // Creamos un equipo
        Equipo equipo = new Equipo("Movistar Team", "España");

        // Creamos ciclistas de cada tipo (polimorfismo: la variable es Ciclista,
        // pero el objeto real es Velocista, Escalador o Contrarrelojista)
        Ciclista c1 = new Velocista(1, "Fernando Gaviria", 1600.0, 72.5);
        Ciclista c2 = new Escalador(2, "Nairo Quintana", 3.2f, 15.0f);
        Ciclista c3 = new Contrarrelojista(3, "Rohan Dennis", 58.4);

        // Les damos un tiempo acumulado de ejemplo (en minutos)
        c1.setTiempoAcumulado(240);
        c2.setTiempoAcumulado(255);
        c3.setTiempoAcumulado(230);

        // Los añadimos al equipo
        equipo.anadirCiclista(c1);
        equipo.anadirCiclista(c2);
        equipo.anadirCiclista(c3);

        // Mostramos los datos generales del equipo
        equipo.imprimirDatosEquipo();

        // Listamos los nombres de los ciclistas
        equipo.listarNombresCiclistas();

        // Mostramos los datos completos de cada ciclista (polimorfismo en accion:
        // cada uno imprime su propio tipo y atributos)
        System.out.println("\n--- Datos de cada ciclista ---");
        for (Ciclista c : equipo.getCiclistas()) {
            c.imprimirDatos();
            System.out.println();
        }

        // Buscamos un ciclista por su id
        System.out.println("--- Buscar ciclista con id 2 ---");
        equipo.imprimirDatosCiclistaPorId(2);
    }
}