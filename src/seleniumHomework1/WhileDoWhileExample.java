package seleniumHomework1;
import java.util.Scanner;

public class WhileDoWhileExample {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // ---------- WHILE LOOP ----------
        System.out.print("Enter a positive number to count down using WHILE loop: ");
        int num1 = scanner.nextInt();

        System.out.println("\nWHILE Loop Output:");
        while (num1 > 0) {
            System.out.println("Count: " + num1);
            num1--;
        }
        System.out.println("WHILE loop finished.\n");

        // ---------- DO–WHILE LOOP ----------
        System.out.print("Enter a positive number to count down using DO–WHILE loop: ");
        int num2 = scanner.nextInt();

        System.out.println("\nDO–WHILE Loop Output:");
        do {
            System.out.println("Count: " + num2);
            num2--;
        } while (num2 > 0);
        System.out.println("DO–WHILE loop finished.");

        scanner.close();
    }
}

