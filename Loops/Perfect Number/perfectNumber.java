import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: "); // Prompt the user to enter a number
        int number = scanner.nextInt(); // Read the input number
        scanner.close();

        int sum = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) { // Check if i is a proper divisor of the number
                sum += i; // Add i to the sum of divisors
            }
        }

        if (sum == number) {
            System.out.println("It is a perfect number."); // Print if the number is perfect
        } else {
            System.out.println("It is not a perfect number."); // Print if the number is not perfect
        }
    }
}
