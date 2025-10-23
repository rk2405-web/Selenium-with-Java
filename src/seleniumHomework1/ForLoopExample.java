package seleniumHomework1;
import java.util.Scanner;

public class ForLoopExample {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number (N): ");
        int n = scanner.nextInt();

        int sum = 0;

        System.out.println("\nNumbers from 1 to " + n + ":");

        // For loop to print numbers 1 to N and calculate sum
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
            sum += i; // Add each number to sum
        }

        System.out.println("\n\nSum of numbers from 1 to " + n + " is: " + sum);

        scanner.close();
    }
}


