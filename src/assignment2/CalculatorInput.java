/*
 * Student Name: JingYi Li
 * Lab Professor: Islam Gomaa
 * Due Date: Nov 25
 * Description: This program allows users to input mathematical equations in the form "num1 operator num2 =".
 */

package assignment2;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 * CalculatorInput class is to keep asking for input until the user quits.
 * @author JingYi Li
 */

public class CalculatorInput {

    private CalculatorEngine engine;

    public CalculatorInput(CalculatorEngine engine) {
        this.engine = engine;
    }

    public void start() {
        Scanner sc = new Scanner(System.in);
        String buffer;

        do {
            System.out.print("\nEnter your equation: ");
            buffer = sc.nextLine();

            if (buffer.equals("0 =")) {
                System.out.println("\nProgram exiting.");
                break;
            }

            if (buffer.trim().isEmpty()) {
                System.out.println("Error: Equation incomplete. First number is missing.");
                continue; // Skip the rest of the loop and ask for input again
            }

            try {
                Scanner input = new Scanner(buffer);
                int num1 = input.nextInt();

                // check sign
                if (!input.hasNext()) {
                    throw new SignMissingException("Error: Equation incomplete. Operator is missing.");
                }

                String sign = input.next();
                if (!sign.matches("[+\\-*/]")) {
                    throw new SignException("Invalid operator. Valid operators are +, -, /, and *");
                }

                // check num2
                int num2;
                if (!input.hasNextInt()) {
                    throw new NoSuchElementException("Second number is missing.");
                }
                num2 = input.nextInt();
                
                // check equals
                if (!input.hasNext()) {
                    throw new EquationException("Equation incomplete. Equation must end with =");
                }
                
                String equals = input.next();
                if (!equals.equals("=")) {
                    throw new EquationException("Equation incomplete. Equation must end with =");
                }

                int result = engine.calculate(num1, num2, sign);
                System.out.println("\nThat answer is: " + result);

            } catch (InputMismatchException e) {
                System.out.println("Error: First number is not an integer.");

            } catch (NoSuchElementException | ArithmeticException | IllegalArgumentException | EquationException | SignException | SignMissingException e) {
                System.out.println("Error: " + e.getMessage());

            }
            
        } while (true);
    }
}

	class SignException extends Exception {
		private static final long serialVersionUID = 1L;
	
	public SignException(String message) {
		super(message);
		}
	}

	class EquationException extends Exception {
		private static final long serialVersionUID = 1L;

	public EquationException(String message) {
        super(message);
    	}
	}

	class SignMissingException extends Exception {
	    private static final long serialVersionUID = 1L;

	    public SignMissingException(String message) {
	        super(message);
	    }
	}