import java.util.Arrays;
import java.util.Scanner;

public class SortedElements {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter array length: ");
        int arrayLength = scan.nextInt();

        // Check if the array length is valid
        if (arrayLength <= 0) {
            System.out.print("Invalid array length. Please enter a positive integer.");
            return;
        }

        int arrayElement;
        int startIndex = 0;
        int[] arr = new int[arrayLength];

        // Get input elements from the user
        for (int i = 1; i <= arrayLength; i++) {
            System.out.print(i + ". Element: ");
            arrayElement = scan.nextInt();
            arr[startIndex++] = arrayElement;
        }

        // Sort the array in ascending order
        Arrays.sort(arr);

        System.out.print("Sorted: ");
        // Print the sorted array
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
