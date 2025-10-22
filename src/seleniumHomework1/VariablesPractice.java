package seleniumHomework1;
import java.util.Scanner;

public class VariablesPractice {

	public static void main(String[] args) {		
		        // Create a Scanner object to read input from user
		        Scanner scanner = new Scanner(System.in);

		        // Take input from the user
		        System.out.print("Enter your name: ");
		        String name = scanner.nextLine();

		        System.out.print("Enter your age: ");
		        int age = scanner.nextInt();

		        System.out.print("Enter your salary: ");
		        double salary = scanner.nextDouble();

		        // Print the entered details
		        System.out.println("\n--- User Details ---");
		        System.out.println("Name: " + name);
		        System.out.println("Age: " + age);
		        System.out.println("Salary: $" + salary);

		        // Close the scanner to avoid resource leak
		        scanner.close();
		    }
		}

