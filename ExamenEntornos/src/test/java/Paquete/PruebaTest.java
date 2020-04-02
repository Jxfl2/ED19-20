/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Paquete;

import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author aaron
 */
public class PruebaTest {
    
    public PruebaTest() {
    }

    @org.junit.jupiter.api.BeforeAll
    public static void setUpClass() throws Exception {
    }

    @org.junit.jupiter.api.AfterAll
    public static void tearDownClass() throws Exception {
    }

    @org.junit.jupiter.api.BeforeEach
    public void setUp() throws Exception {
    }

    @org.junit.jupiter.api.AfterEach
    public void tearDown() throws Exception {
    }


    /**
     * Test of aProbar method, of class Prueba.
     */
    @org.junit.jupiter.api.Test
    public void testAProbar1() {
        System.out.println("aProbar");
        int q = -1;
        int expResult = 0;
        int result = Prueba.aProbar(q);
        assertEquals(expResult, result);
    }
    public void testAProbar2() {
        System.out.println("aProbar");
        int q = 0;
        int expResult = 0;
        int result = Prueba.aProbar(q);
        assertEquals(expResult, result);
    }
    public void testAProbar3() {
        System.out.println("aProbar");
        int q = 1;
        int expResult = 1;
        int result = Prueba.aProbar(q);
        assertEquals(expResult, result);
    }
}
