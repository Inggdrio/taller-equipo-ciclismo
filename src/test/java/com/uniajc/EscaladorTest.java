package com.uniajc;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

// Pruebas para la clase Escalador
class EscaladorTest {

    // Reviso que el escalador se cree bien con sus datos
    @Test
    void testCreacionEscalador() {
        Escalador e = new Escalador(2, "Nairo", 3.2f, 15.0f);
        assertEquals(2, e.getIdentificador());
        assertEquals("Nairo", e.getNombre());
        assertEquals(3.2f, e.getAceleracionPromedio());
        assertEquals(15.0f, e.getGradoRampa());
    }

    // El tiempo acumulado debe arrancar en 0
    @Test
    void testTiempoInicialEnCero() {
        Escalador e = new Escalador(2, "Nairo", 3.2f, 15.0f);
        assertEquals(0, e.getTiempoAcumulado());
    }

    // imprimirTipo debe devolver "Escalador"
    @Test
    void testImprimirTipo() {
        Escalador e = new Escalador(2, "Nairo", 3.2f, 15.0f);
        assertEquals("Escalador", e.imprimirTipo());
    }

    // El setter del grado de rampa debe funcionar
    @Test
    void testSetGradoRampa() {
        Escalador e = new Escalador(2, "Nairo", 3.2f, 15.0f);
        e.setGradoRampa(20.0f);
        assertEquals(20.0f, e.getGradoRampa());
    }
}