package seleniumHomework1;
import java.util.Scanner;

public class MethodsExample {

    // 1️⃣ Static method to calculate sum of two numbers
    public static int findSum(int a, int b) {
        return a + b;
    }

    // 2️⃣ Non-static method to calculate factorial
    public int findFactorial(int number) {
        int fact = 1;
        for (int i = 1; i <= number; i++) {
            fact = fact * i;
        }
        return fact;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take input from user
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        // Call static method directly
        int sumResult = findSum(num1, num2);
        System.out.println("Sum of two numbers: " + sumResult);

        // Call non-static method (need object)
        System.out.print("Enter a number to find factorial: ");
        int number = sc.nextInt();

        MethodsExample obj = new MethodsExample(); // create object
        int factorialResult = obj.findFactorial(number);
        System.out.println("Factorial of " + number + " is: " + factorialResult);

        sc.close();
    }
}

