import java.util.Scanner;

public class MinMaxNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many numbers will you enter: ");
        int n = scanner.nextInt();

        int min = Integer.MAX_VALUE; // Initialize min with the maximum possible value
        int max = Integer.MIN_VALUE; // Initialize max with the minimum possible value

        for (int i = 1; i <= n; i++) {
            System.out.print("Enter number " + i + ": ");
            int number = scanner.nextInt();

            if (number < min) {
                min = number; // Update min if the entered number is smaller
            }

            if (number > max) {
                max = number; // Update max if the entered number is larger
            }
        }

        System.out.println("Maximum number: " + max);
        System.out.println("Minimum number: " + min);
    }
}
