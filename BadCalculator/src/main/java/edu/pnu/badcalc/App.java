package edu.pnu.badcalc;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Bad Calculator v1.0");
            System.out.println("Type expressions like: 2 + 3  (or 'quit' to exit)");

            while (true) {
                System.out.print("> ");
                String line = scanner.nextLine().trim();

                if (line.equalsIgnoreCase("quit")) {
                    System.out.println("Bye!");
                    break;
                }

                if (line.isEmpty()) {
                    System.out.println("Please enter an expression or 'quit'.");
                    continue;
                }

                try {
                    double result = calculator.parseAndCompute(line);
                    System.out.println("= " + result);
                } catch (IllegalArgumentException | ArithmeticException e) {
                    System.out.println("Invalid expression: " + e.getMessage());
                }
            }
        }
    }
}
