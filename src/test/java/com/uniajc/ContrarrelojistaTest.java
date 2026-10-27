package com.uniajc;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

// Pruebas para la clase Contrarrelojista
class ContrarrelojistaTest {

    // Reviso que el contrarrelojista se cree bien con sus datos
    @Test
    void testCreacionContrarrelojista() {
        Contrarrelojista c = new Contrarrelojista(3, "Dennis", 58.4);
        assertEquals(3, c.getIdentificador());
        assertEquals("Dennis", c.getNombre());
        assertEquals(58.4, c.getVelocidadMaxima());
    }

    // El tiempo acumulado debe arrancar en 0
    @Test
    void testTiempoInicialEnCero() {
        Contrarrelojista c = new Contrarrelojista(3, "Dennis", 58.4);
        assertEquals(0, c.getTiempoAcumulado());
    }

    // imprimirTipo debe devolver "Contrarrelojista"
    @Test
    void testImprimirTipo() {
        Contrarrelojista c = new Contrarrelojista(3, "Dennis", 58.4);
        assertEquals("Contrarrelojista", c.imprimirTipo());
    }

    // El setter de la velocidad maxima debe funcionar
    @Test
    void testSetVelocidadMaxima() {
        Contrarrelojista c = new Contrarrelojista(3, "Dennis", 58.4);
        c.setVelocidadMaxima(60.0);
        assertEquals(60.0, c.getVelocidadMaxima());
    }
}