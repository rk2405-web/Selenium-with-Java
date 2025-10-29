package seleniumHomework1;
import java.util.Scanner;

public class ReverseArrayExample {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Take array size from user
        System.out.print("Enter the number of elements: ");
        int size = scanner.nextInt();

        int[] numbers = new int[size];

        // Read elements from user
        System.out.println("Enter " + size + " numbers:");
        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }

        // Print original array
        System.out.println("\nOriginal order:");
        for (int i = 0; i < size; i++) {
            System.out.print(numbers[i] + " ");
        }

        // Print array in reverse order
        System.out.println("\n\nReverse order:");
        for (int i = size - 1; i >= 0; i--) {
            System.out.print(numbers[i] + " ");
        }

        System.out.println(); // new line
        scanner.close();
    }
}

