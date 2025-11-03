package seleniumHomework1;
import java.util.Scanner;

public class PalindromeExample {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Ask user to enter a string
        System.out.print("Enter a word or phrase: ");
        String input = scanner.nextLine();

        // Convert to lowercase and remove spaces for consistent comparison
        String cleaned = input.toLowerCase().replaceAll("\\s+", "");

        // Reverse the string
        String reversed = "";
        for (int i = cleaned.length() - 1; i >= 0; i--) {
            reversed += cleaned.charAt(i);
        }

        // Compare original and reversed
        if (cleaned.equals(reversed)) {
            System.out.println("✅ '" + input + "' is a palindrome.");
        } else {
            System.out.println("❌ '" + input + "' is not a palindrome.");
        }

        scanner.close();
    }
}

