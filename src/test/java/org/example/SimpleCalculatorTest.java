package org.example;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpleCalculatorTest {

    @Test
    void twoPlusTwoShouldEqualFour() {
        SimpleCalculator calculator = new SimpleCalculator();
        assertEquals(4, calculator.add(2, 2));
    }


    @Test
    void twoMoinsTwoShouldEqualZero() {
        SimpleCalculator calculator = new SimpleCalculator();
        assertEquals(0, calculator.subtraction(2, 2));
    }

    @Test
    void twoFoisTwoShouldEqualFour() {
        SimpleCalculator calculator = new SimpleCalculator();
        assertEquals(4, calculator.multiplication(2, 2));
    }

    @Test
    void twoDiviseBytwoEqualOne() {
        SimpleCalculator calculator = new SimpleCalculator();
        assertEquals(1, calculator.division(2,2));
    }
}