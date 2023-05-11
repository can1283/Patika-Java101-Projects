import java.util.Scanner;

public class CombinationCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();

        System.out.print("Enter the value of r: ");
        int r = scanner.nextInt();

        scanner.close();

        int factorialN = 1;
        int factorialR = 1;
        int factorialNR = 1;

        // Calculate factorial of n
        for (int i = 1; i <= n; i++) {
            factorialN *= i;
        }

        // Calculate factorial of r
        for (int i = 1; i <= r; i++) {
            factorialR *= i;
        }

        // Calculate factorial of (n-r)
        for (int i = 1; i <= (n - r); i++) {
            factorialNR *= i;
        }

        // Calculate the combination
        int combination = factorialN / (factorialR * factorialNR);

        System.out.println("C(" + n + ", " + r + ") = " + combination);
    }
}
