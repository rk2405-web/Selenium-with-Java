package seleniumHomework1;
import java.util.Scanner;

public class ReverseStringMethod {

    // Method that takes a string and returns its reverse
    public static String reverseString(String text) {
        String reversed = "";
        for (int i = text.length() - 1; i >= 0; i--) {
            reversed = reversed + text.charAt(i);
        }
        return reversed;  // returning the reversed string
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input from user
        System.out.print("Enter a word or sentence: ");
        String input = sc.nextLine();

        // Call the reverseString method and store the return value
        String result = reverseString(input);

        System.out.println("Reversed String: " + result);

        sc.close();
    }
}

