import java.util.Scanner;

public class Pow {
    // Recursive method to calculate the power
    public static int power(int base, int exponent) {
        if (exponent == 0) {
            return 1;
        } else if (exponent > 0) {
            return base * power(base, exponent - 1);
        } else {
            return 1 / (base * power(base, -exponent - 1));
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the base: ");
        int base = scanner.nextInt();

        System.out.print("Enter the exponent: ");
        int exponent = scanner.nextInt();

        // Calculate the result using the power method
        long result = power(base, exponent);

        // Print the result
        System.out.print("Result: " + result);
    }
}
