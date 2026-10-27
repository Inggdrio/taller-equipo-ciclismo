package com.uniajc;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

// Pruebas para la clase Velocista
class VelocistaTest {

    // Reviso que el velocista se cree bien con todos sus datos
    @Test
    void testCreacionVelocista() {
        Velocista v = new Velocista(1, "Gaviria", 1600.0, 72.5);
        assertEquals(1, v.getIdentificador());
        assertEquals("Gaviria", v.getNombre());
        assertEquals(1600.0, v.getPotenciaPromedio());
        assertEquals(72.5, v.getVelocidadPromedioSprint());
    }

    // El tiempo acumulado debe arrancar en 0 al crear el ciclista
    @Test
    void testTiempoInicialEnCero() {
        Velocista v = new Velocista(1, "Gaviria", 1600.0, 72.5);
        assertEquals(0, v.getTiempoAcumulado());
    }

    // imprimirTipo debe devolver "Velocista"
    @Test
    void testImprimirTipo() {
        Velocista v = new Velocista(1, "Gaviria", 1600.0, 72.5);
        assertEquals("Velocista", v.imprimirTipo());
    }

    // Si cambio el tiempo con el setter debe actualizarse
    @Test
    void testSetTiempoAcumulado() {
        Velocista v = new Velocista(1, "Gaviria", 1600.0, 72.5);
        v.setTiempoAcumulado(240);
        assertEquals(240, v.getTiempoAcumulado());
    }
}