package seleniumHomework1;
import java.util.Scanner;

public class ParameterPassingExample {

    // Method that accepts a string and prints its length
    public static void printStringLength(String text) {
        int length = text.length();
        System.out.println("Length of the string is: " + length);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take input from user
        System.out.print("Enter any word or sentence: ");
        String input = sc.nextLine();

        // Call method and pass string as parameter
        printStringLength(input);

        sc.close();
    }
}

