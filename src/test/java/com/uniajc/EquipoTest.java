package com.uniajc;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

// Pruebas para la clase Equipo
class EquipoTest {

    // El tiempo total es static (compartido), asi que lo reinicio antes de
    // cada prueba para que una no afecte a la otra
    @BeforeEach
    void limpiar() {
        Equipo.setTiempoTotalEquipo(0);
    }

    // Reviso que el equipo se cree bien con nombre y pais
    @Test
    void testCreacionEquipo() {
        Equipo eq = new Equipo("Movistar", "España");
        assertEquals("Movistar", eq.getNombreEquipo());
        assertEquals("España", eq.getPais());
    }

    // Un equipo nuevo debe arrancar sin ciclistas
    @Test
    void testEquipoArrancaVacio() {
        Equipo eq = new Equipo("Movistar", "España");
        assertEquals(0, eq.getCiclistas().size());
    }

    // Al anadir ciclistas la lista debe crecer
    @Test
    void testAnadirCiclistas() {
        Equipo eq = new Equipo("Movistar", "España");
        eq.anadirCiclista(new Velocista(1, "Gaviria", 1600.0, 72.5));
        eq.anadirCiclista(new Escalador(2, "Nairo", 3.2f, 15.0f));
        assertEquals(2, eq.getCiclistas().size());
    }

    // El tiempo total del equipo debe sumar los tiempos de los ciclistas
    @Test
    void testSumaTiempoTotal() {
        Equipo eq = new Equipo("Movistar", "España");
        Velocista v = new Velocista(1, "Gaviria", 1600.0, 72.5);
        Escalador e = new Escalador(2, "Nairo", 3.2f, 15.0f);
        v.setTiempoAcumulado(240);
        e.setTiempoAcumulado(255);
        eq.anadirCiclista(v);
        eq.anadirCiclista(e);
        assertEquals(495, Equipo.getTiempoTotalEquipo());
    }
}