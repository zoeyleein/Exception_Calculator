package assignment2;

public class CalculatorEngine {
    public void calculate(int num1, int num2, String sign) {
        try {
            switch (sign) {
                case "+":
                    System.out.println("\nThat answer is: " + add(num1, num2));
                    break;
                case "-":
                    System.out.println("\nThat answer is: " + subtract(num1, num2));
                    break;
                case "*":
                    System.out.println("\nThat answer is: " + multiply(num1, num2));
                    break;
                case "/":
                    System.out.println("\nThat answer is: " + divide(num1, num2));
                    break;
                default:
                    throw new IllegalArgumentException("Invalid operator. Valid operators are +, -, /, and *");
            }
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage() + " Result is invalid, returning zero.");
        }
    }

    private int add(int num1, int num2) {
        return num1 + num2;
    }

    private int subtract(int num1, int num2) {
        return num1 - num2;
    }

    private int multiply(int num1, int num2) {
        return num1 * num2;
    }

    private int divide(int num1, int num2) {
        if (num2 == 0) {
            throw new ArithmeticException("Can not divide by zero!");
        }
        return num1 / num2;
    }
}