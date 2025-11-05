package seleniumHomework1;
import java.util.Scanner;

public class ReplaceTrimExample {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take input from user
        System.out.print("Enter a sentence with extra spaces: ");
        String text = sc.nextLine();

        // 1️⃣ Trim - remove spaces from beginning and end
        String trimmedText = text.trim();
        System.out.println("After trim: '" + trimmedText + "'");

        // 2️⃣ Replace - replace a word or character
        String replacedText = trimmedText.replace("test", "practice");
        System.out.println("After replace: " + replacedText);

        // 3️⃣ Convert to upper case
        String upperCaseText = replacedText.toUpperCase();
        System.out.println("After toUpperCase: " + upperCaseText);

        sc.close();
    }
}

