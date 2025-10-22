package seleniumHomework1;
import java.util.Scanner;

public class ArthimeticOperations {

	public static void main(String[] args) {
		
		        // Create Scanner object to take input from user
		        Scanner scanner = new Scanner(System.in);

		        // Take two numbers as input
		        System.out.print("Enter first number: ");
		        double num1 = scanner.nextDouble();

		        System.out.print("Enter second number: ");
		        double num2 = scanner.nextDouble();

		        // Perform basic arithmetic operations
		        double addition = num1 + num2;
		        double subtraction = num1 - num2;
		        double multiplication = num1 * num2;
		        double division = num1 / num2;
		        double modulus = num1 % num2;

		        // Display results
		        System.out.println("\n--- Arithmetic Operations ---");
		        System.out.println("Addition: " + addition);
		        System.out.println("Subtraction: " + subtraction);
		        System.out.println("Multiplication: " + multiplication);
		        System.out.println("Division: " + division);
		        System.out.println("Modulus: " + modulus);

		        // Close the scanner
		        scanner.close();
		    }
		}
