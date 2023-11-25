package assignment2;

import java.util.Scanner;

public class CalculatorInput {
    private CalculatorEngine engine;

    public CalculatorInput(CalculatorEngine engine) {
        this.engine = engine;
    }

    public void start() {
        Scanner keyboard = new Scanner(System.in);
        String buffer;

        do {
            System.out.print("Enter your equation: ");
            buffer = keyboard.nextLine();

            if (buffer.equals("0 =")) {
                System.out.println("\nProgram exiting.");
                break;
            }

            try {
                Scanner input = new Scanner(buffer);
                int num1 = input.nextInt();
                String sign = input.next();
                int num2 = input.nextInt();
                String equals = input.next();

                engine.calculate(num1, num2, sign);
            } catch (java.util.InputMismatchException e) {
                System.out.println("\nError: First or second number is not an integer.");
            } catch (java.util.NoSuchElementException e) {
                System.out.println("\nError: Equation incomplete. Operator or number is missing.");
            } catch (ArithmeticException e) {
                System.out.println("Error: " + e.getMessage());
            }
        } while (true);
    }
}