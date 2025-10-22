package seleniumHomework1;
import java.util.Scanner;

public class NestedIfGrade {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your score (0–100): ");
        int score = scanner.nextInt();

        // Nested if example
        if (score >= 0 && score <= 100) {  // Valid score check
            if (score >= 90) {
                System.out.println("Grade: A");
            } else if (score >= 75) {
                System.out.println("Grade: B");
            } else if (score >= 60) {
                System.out.println("Grade: C");
            } else {
                System.out.println("Grade: D (Needs Improvement)");
            }
        } else {
            System.out.println("Invalid score! Please enter a value between 0 and 100.");
        }

        scanner.close();
    }
}