//Felipe Valdés Viveros Programación ICC 264 -1//
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class VenderorSopaipillasTest {
    private VenderorSopaipillas vendedor;

    @BeforeEach
    void setUp() {
        vendedor = new VenderorSopaipillas();
    }

    @AfterEach
    void tearDown() {
        vendedor = null;
    }

    @Test
    void setPrecioSopaipilla() {
        int resultadoEsperado = 350;
        int resultadoObtenido = vendedor.setPrecioSopaipilla(350);
        assertEquals(resultadoEsperado, resultadoObtenido);
    }
    @Test
    void vender() {
        int resultadoEsperado = 4;
        int resultadoObtenido = vendedor.vender(4);
        assertEquals(resultadoEsperado, resultadoObtenido);
    }

    @Test
    void pagar() {
        int resultadoEsperado = 1400;
        int resultadoObtenido = vendedor.pagar(1400);
        assertEquals(resultadoEsperado, resultadoObtenido);
    }

    @Test
    void calcularVuelto() {
    assertNotNull(vendedor);
    }

    @Test
    void getGanancias() {
        assertNotNull(vendedor);
    }



}