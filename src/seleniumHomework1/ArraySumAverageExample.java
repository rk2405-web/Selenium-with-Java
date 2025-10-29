package seleniumHomework1;
import java.util.Scanner;

public class ArraySumAverageExample {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Ask the user how many numbers they want to enter
        System.out.print("Enter the number of elements: ");
        int size = scanner.nextInt();

        // Declare an array of given size
        int[] numbers = new int[size];
        int sum = 0;

        // Take input for each array element
        System.out.println("Enter " + size + " numbers:");
        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
            sum += numbers[i];
        }

        // Calculate average
        double average = (double) sum / size;

        // Print results
        System.out.println("\nSum of array elements: " + sum);
        System.out.println("Average of array elements: " + average);

        scanner.close();
    }
}

