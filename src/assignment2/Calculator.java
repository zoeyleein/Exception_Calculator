/*
 * Student Name: JingYi Li
 * Lab Professor: Islam Gomaa
 * Due Date: Nov 25
 * Description: This program allows users to input mathematical equations in the form "num1 operator num2 =".
 */

package assignment2;

/**
 * Calculator class to show information and instantiate the CalculatorEngine and CalculatorInput classes.
 * @author JingYi Li
 */
public class Calculator {

	public static void main(String[] args) {
		
        System.out.println("Welcome to the Assignment 2 CST8284 calculator.");
        System.out.println("Written by JingYi Li, #041091658\n\n");
        System.out.println("Equations are in the form num1 operator num2 = ");
        System.out.println("Where num1 and num2 must be integers,");
        System.out.println("operator is one of +, -, / or *");
        System.out.println("\nEnter 0 = to quit.\n\n");
		
		CalculatorEngine engine = new CalculatorEngine();
		CalculatorInput calculatorInput = new CalculatorInput(engine);
		calculatorInput.start();

	}

}
