package edu.pnu.badcalc;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    // ===== Basic operations =====

    @Test
    void testAdd() {
        Calculator c = new Calculator();
        double result = c.add(2, 3);
        assertEquals(5.0, result);
    }

    @Test
    void testSubtract() {
        Calculator c = new Calculator();
        double result = c.subtract(5, 2);
        assertEquals(3.0, result);
    }

    @Test
    void testMultiply() {
        Calculator c = new Calculator();
        double result = c.multiply(2.5, 2);
        assertEquals(5.0, result);
    }

    @Test
    void testDivide() {
        Calculator c = new Calculator();
        double result = c.divide(10, 2);
        assertEquals(5.0, result);
    }

    @Test
    void testDivideByZeroThrows() {
        Calculator c = new Calculator();
        assertThrows(ArithmeticException.class,
                () -> c.divide(5, 0));
    }

    // ===== factorial =====

    @Test
    void testFactorialOfZero() {
        Calculator c = new Calculator();
        long result = c.factorial(0);
        assertEquals(1L, result);
    }

    @Test
    void testFactorialOfFive() {
        Calculator c = new Calculator();
        long result = c.factorial(5);
        // 5! = 120
        assertEquals(120L, result);
    }

    @Test
    void testFactorialNegativeThrows() {
        Calculator c = new Calculator();
        assertThrows(IllegalArgumentException.class,
                () -> c.factorial(-1));
    }

    // ===== parseAndCompute =====

    @Test
    void testParseAndComputeAdd() {
        Calculator c = new Calculator();
        double result = c.parseAndCompute("2 + 3");
        assertEquals(5.0, result);
    }

    @Test
    void testParseAndComputeSubtract() {
        Calculator c = new Calculator();
        double result = c.parseAndCompute("5 - 2");
        assertEquals(3.0, result);
    }

    @Test
    void testParseAndComputeMultiply() {
        Calculator c = new Calculator();
        double result = c.parseAndCompute("2 * 2.5");
        assertEquals(5.0, result);
    }

    @Test
    void testParseAndComputeDivide() {
        Calculator c = new Calculator();
        double result = c.parseAndCompute("10 / 2");
        assertEquals(5.0, result);
    }

    @Test
    void testParseAndComputeInvalidOperator() {
        Calculator c = new Calculator();
        assertThrows(IllegalArgumentException.class,
                () -> c.parseAndCompute("2 ? 3"));
    }

    @Test
    void testParseAndComputeBadFormat() {
        Calculator c = new Calculator();
        assertThrows(IllegalArgumentException.class,
                () -> c.parseAndCompute("2 +"));
    }
}
