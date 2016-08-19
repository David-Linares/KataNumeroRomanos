/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.testng.Assert;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author Ximena Garzón Sandoval
 * @author David Alexander Linares Villamil
 */
public class KataNumerosRomanosTest {

    public KataNumerosRomanosTest() {
    }

    @Test
    public void esNumero() {
        String valorEsperado = "5A";
        try {
            Integer.parseInt(valorEsperado);
            Assert.assertTrue(true);
        } catch (Exception e) {
            Assert.assertTrue(false);
        }
    }

    @Test
    public void esPositivo() {
        int valorEsperado = -5;
        if (valorEsperado > 0) {
            Assert.assertTrue(true);
        } else {
            Assert.assertTrue(false);
        }
    }

    @Test
    public void simbolosRomanosBasicos() {
        String valorEsperado = "1";
        String constante = ConstantesRomanas.getSimbolo(valorEsperado);
        Assert.assertEquals(valorEsperado, constante);
    }

    @Test
    public void casosEspeciales() {
        int valor = 4;
        String valorEsperado = "IV";
        String constante = ConstantesRomanas.getSimbolo(valorEsperado + 1);
        Assert.assertEquals("I" + constante, valorEsperado);
    }


@Test
    public void 
}
