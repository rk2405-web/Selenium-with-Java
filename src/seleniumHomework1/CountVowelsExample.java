package seleniumHomework1;
import java.util.Scanner;

public class CountVowelsExample {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Ask user for input
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Convert to lowercase for easier comparison
        input = input.toLowerCase();

        int vowels = 0;
        int consonants = 0;

        // Loop through each character
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            // Check if it's a letter (ignore spaces, numbers, symbols)
            if (ch >= 'a' && ch <= 'z') {
                // Check vowels
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }

        System.out.println("\nTotal vowels: " + vowels);
        System.out.println("Total consonants: " + consonants);

        scanner.close();
    }
}

