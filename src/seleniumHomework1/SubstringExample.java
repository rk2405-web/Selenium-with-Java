package seleniumHomework1;
import java.util.Scanner;

public class SubstringExample {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take input from user
        System.out.print("Enter a sentence: ");
        String text = sc.nextLine();

        // Ask user for starting and ending positions
        System.out.print("Enter start index: ");
        int start = sc.nextInt();

        System.out.print("Enter end index: ");
        int end = sc.nextInt();

        // Extract substring safely
        if (start >= 0 && end <= text.length() && start < end) {
            String result = text.substring(start, end);
            System.out.println("Extracted Substring: " + result);
        } else {
            System.out.println("Invalid indices entered!");
        }

        sc.close();
    }
}

