package seleniumHomework1;
import java.util.Scanner;

public class ArrayMaxMinExample {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Ask user for array size
        System.out.print("Enter number of elements: ");
        int size = scanner.nextInt();

        int[] numbers = new int[size];

        // Take input for array elements
        System.out.println("Enter " + size + " numbers:");
        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }

        // Initialize min and max with the first element
        int max = numbers[0];
        int min = numbers[0];

        // Loop through array to find max and min
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }

        // Print the results
        System.out.println("\nLargest number: " + max);
        System.out.println("Smallest number: " + min);

        scanner.close();
    }
}
