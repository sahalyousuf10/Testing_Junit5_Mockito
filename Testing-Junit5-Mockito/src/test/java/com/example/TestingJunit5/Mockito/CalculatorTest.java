package com.example.TestingJunit5.Mockito;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    Calculator calculator;

//    @BeforeEach
//    public void setup(){
//
//        calculator = new Calculator();
//    }

    @Test
    public void testMultiply(){
        calculator = new Calculator();
        assertEquals(20, calculator.multiply(4, 5));
    }

    @Test
    public void testMultiply_DiffParams(){
        calculator = new Calculator();
        assertEquals(25, calculator.multiply(5, 5));
    }

    @Test
    public void testDivide(){

        calculator = new Calculator();
        assertEquals(2, calculator.divide(4, 2));
    }

}
