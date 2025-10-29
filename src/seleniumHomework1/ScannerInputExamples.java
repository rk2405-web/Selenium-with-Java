package seleniumHomework1;

import java.util.Scanner;

public class ScannerInputExamples {
    public static void main(String[] args) {

        // Create Scanner object to read input from keyboard
        Scanner scanner = new Scanner(System.in);

        // Take user name input
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        // Take user age input
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        // Print greeting message
        System.out.println("\nHello, " + name + "! You are " + age + " years old.");

        // Close the scanner to prevent memory leaks
        scanner.close();
    }
}

