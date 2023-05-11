import java.util.Scanner;

public class GcdLcmWhile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int number1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int number2 = scanner.nextInt();

        scanner.close();

        // GCD calculation
        int gcd = 0;
        int max = Math.max(number1, number2);
        int min = Math.min(number1, number2);

        while (min != 0) {
            int temp = min;
            min = max % min;
            max = temp;
        }

        gcd = max;

        System.out.println("GCD: " + gcd);

        // LCM calculation
        int lcm = (number1 * number2) / gcd;

        System.out.println("LCM: " + lcm);
    }
}
