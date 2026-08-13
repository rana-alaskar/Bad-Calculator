package edu.pnu.badcalc;

/**
 * Simple, stateless calculator with basic operations.
 */
public class Calculator {

    public double add(double a, double b) {
        return a + b;
    }

    public double subtract(double a, double b) {
        return a - b;
    }

    public double multiply(double a, double b) {
        return a * b;
    }

    public double divide(double a, double b) {
        if (b == 0.0) {
            throw new ArithmeticException("Division by zero");
        }
        return a / b;
    }

    public long factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("n must be >= 0");
        }
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    /**
     * Parse and evaluate an expression like "a op b".
     * Supported operators: +, -, *, /
     */
    public double parseAndCompute(String expr) {
        String[] t = expr.trim().split("\\s+");
        if (t.length != 3) {
            throw new IllegalArgumentException("Expression must be 'a op b'");
        }

        double a = Double.parseDouble(t[0]);
        String op = t[1];
        double b = Double.parseDouble(t[2]);

        switch (op) {
            case "+":
                return add(a, b);
            case "-":
                return subtract(a, b);
            case "*":
                return multiply(a, b);
            case "/":
                return divide(a, b);
            default:
                throw new IllegalArgumentException("Unknown operator: " + op);
        }
    }
}
