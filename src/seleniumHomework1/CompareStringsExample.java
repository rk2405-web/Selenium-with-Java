package seleniumHomework1;
import java.util.Scanner;

public class CompareStringsExample {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take two string inputs from user
        System.out.print("Enter first string: ");
        String first = sc.nextLine();

        System.out.print("Enter second string: ");
        String second = sc.nextLine();

        // Compare ignoring case
        if (first.equalsIgnoreCase(second)) {
            System.out.println("✅ Both strings are equal (case ignored).");
        } else {
            System.out.println("❌ Strings are not equal.");
        }

        // Just to show the difference if compared normally
        if (first.equals(second)) {
            System.out.println("They are exactly the same (case-sensitive).");
        } else {
            System.out.println("They differ when case is considered.");
        }

        sc.close();
    }
}
