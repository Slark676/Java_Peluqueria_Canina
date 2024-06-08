/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.mycompany.peluqueriacanina.logica;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author kelvi
 */
public class ControladoraTest {
    
    public ControladoraTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of guardar method, of class Controladora.
     */
    @Test
    public void testGuardar() {
        System.out.println("Guardar Datos Vacios");
        String nombreMasco = "";
        String raza = "";
        String color = "";
        String observaciones = "";
        String alergico = "";
        String atenEsp = "";
        String nombDueno = "";
        String celDueno = "";
        Controladora instance = new Controladora();
        instance.guardar(nombreMasco, raza, color, observaciones, alergico, atenEsp, nombDueno, celDueno);
    }
}
