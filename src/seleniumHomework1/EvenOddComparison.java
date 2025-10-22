package seleniumHomework1;
import java.util.Scanner;

public class EvenOddComparison {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // --- Check Even or Odd ---
        System.out.print("Enter a number to check even/odd: ");
        int num = scanner.nextInt();

        if (num % 2 == 0) {
            System.out.println(num + " is Even.");
        } else {
            System.out.println(num + " is Odd.");
        }

        // --- Compare Two Numbers ---
        System.out.print("\nEnter first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();

        if (num1 > num2) {
            System.out.println(num1 + " is greater than " + num2);
        } else if (num1 < num2) {
            System.out.println(num2 + " is greater than " + num1);
        } else {
            System.out.println("Both numbers are equal.");
        }

        scanner.close();
    }
}
