package seleniumHomework1;
import java.util.Scanner;

public class ArrayBasicsExample {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Ask user for the number of elements
        System.out.print("Enter the number of elements in the array: ");
        int size = scanner.nextInt();

        // Create an integer array
        int[] numbers = new int[size];

        // Take input for array elements
        System.out.println("\nEnter " + size + " numbers:");
        for (int i = 0; i < size; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        // Print all elements using a for loop
        System.out.println("\n--- Array Elements ---");
        for (int i = 0; i < size; i++) {
            System.out.println("Element at index " + i + ": " + numbers[i]);
        }

        // Print all elements using enhanced for loop
        System.out.println("\n--- Using Enhanced For Loop ---");
        for (int num : numbers) {
            System.out.println(num);
        }

        scanner.close();
    }
}

