package service;

import org.junit.Assert;
import org.junit.Test;

public class MatematicaServiceTest {

    MatematicaService matematicaService = new MatematicaServiceImpl();

    @Test
    public void testCalcularMCD() {
        Assert.assertEquals(6, matematicaService.calcularMCD(12, 18));
        Assert.assertEquals(1, matematicaService.calcularMCD(7, 13));
        Assert.assertEquals(4, matematicaService.calcularMCD(4, 8));
    }

    @Test
    public void testCalcularMCM() {
        Assert.assertEquals(36, matematicaService.calcularMCM(12, 18));
        Assert.assertEquals(91, matematicaService.calcularMCM(7, 13));
        Assert.assertEquals(8, matematicaService.calcularMCM(4, 8));
        Assert.assertEquals(0, matematicaService.calcularMCM(0, 5)); // Caso borde
    }
}

