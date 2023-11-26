/*
 * Student Name: JingYi Li
 * Lab Professor: Islam Gomaa
 * Due Date: Nov 25
 * Description: This program allows users to input mathematical equations in the form "num1 operator num2 =".
 */
package assignment2;

/**
 * CalculatorEngine class is for defining operators.
 * @author JingYi Li
 */
public class CalculatorEngine {
	
	/**
	 * for the calculation
	 * @param num1
	 * @param num2
	 * @param sign
	 * @return +,-,*,/ with the formula
	 */
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
	
	/**
	 * add calculation
	 * @param num1
	 * @param num2
	 * @return num1 + num2
	 */
	private int add(int num1, int num2) {
	    return num1 + num2;
	}
	
	/**
	 * subtract calculation
	 * @param num1
	 * @param num2
	 * @return num1 - num2
	 */
	private int subtract(int num1, int num2) {
	    return num1 - num2;
	}
	
	/**
	 * multiply calculation
	 * @param num1
	 * @param num2
	 * @return num1 * num2
	 */
	private int multiply(int num1, int num2) {
	    return num1 * num2;
	}
	
	/**
	 * divide calculation
	 * @param num1
	 * @param num2
	 * @return num1 / num2
	 */
	private int divide(int num1, int num2) {
	    if (num2 == 0) {
	        throw new ArithmeticException("Can not divide by zero! Result is invalid, returning zero.");
	    }
	    return num1 / num2;
	}
}