package seleniumHomework1;
import java.util.Scanner;

public class MiniCalculatorProject {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double num1, num2, result = 0;
        char operator;

        System.out.println("=== Simple Calculator ===");

        // Take two numbers as input
        System.out.print("Enter first number: ");
        num1 = scanner.nextDouble();

        System.out.print("Enter second number: ");
        num2 = scanner.nextDouble();

        // Display operation choices
        System.out.println("\nChoose an operation:");
        System.out.println("+ for Addition");
        System.out.println("- for Subtraction");
        System.out.println("* for Multiplication");
        System.out.println("/ for Division");
        System.out.println("% for Modulus");

        System.out.print("Enter your choice: ");
        operator = scanner.next().charAt(0);

        // Perform the selected operation
        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 != 0)
                    result = num1 / num2;
                else {
                    System.out.println("Error: Division by zero is not allowed!");
                    scanner.close();
                    return;
                }
                break;
            case '%':
                if (num2 != 0)
                    result = num1 % num2;
                else {
                    System.out.println("Error: Modulus by zero is not allowed!");
                    scanner.close();
                    return;
                }
                break;
            default:
                System.out.println("Invalid operator! Please enter +, -, *, /, or %.");
                scanner.close();
                return;
        }

        // Display result
        System.out.println("\nResult: " + num1 + " " + operator + " " + num2 + " = " + result);

        scanner.close();
    }
}

