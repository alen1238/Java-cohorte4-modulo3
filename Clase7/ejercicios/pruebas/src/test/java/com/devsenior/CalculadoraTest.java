package com.devsenior;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class CalculadoraTest {
    
    
    @Test
    void testSuma(){
        Calculadora calc = new Calculadora();
        assertEquals(5, calc.sumar(2,3));
    }

    @Test
    void testResta(){
        Calculadora calc = new Calculadora();
        assertEquals(1, calc.restar(3,2));
    }

    @Test
    void testMultiplicacion(){
        Calculadora calc = new Calculadora();
        assertEquals(6, calc.multiplicar(2,3));
    }

    @Test
    void testDivision(){
        Calculadora calc = new Calculadora();
        assertEquals(2, calc.dividir(6,3));
    }

    @Test
    void testDivisionPorCero(){
        Calculadora calc = new Calculadora();
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            calc.dividir(6, 0);
        });
        assertEquals("No se puede dividir por cero", exception.getMessage());
    }
}
