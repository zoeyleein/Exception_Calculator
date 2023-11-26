package assignment2;



public class CalculatorEngine {
	
	public int calculate(int num1, int num2, String sign) {
	    switch (sign) {
	        case "+":
	            return add(num1, num2);
	        case "-":
	            return subtract(num1, num2);
	        case "*":
	            return multiply(num1, num2);
	        case "/":
	            return divide(num1, num2);
	        default:
	            throw new IllegalArgumentException("Invalid operator. Valid operators are +, -, /, and *");
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
	        throw new ArithmeticException("Can not divide by zero! Result is invalid, returning zero.");
	    }
	    return num1 / num2;
	}
}