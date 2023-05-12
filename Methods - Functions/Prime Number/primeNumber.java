import java.util.Scanner;

public class PrimeNumber {
    // Recursive method to check if a number is prime
    public static boolean isPrime(int number, int divisor) {
        if (number <= 2) {
            return (number == 2);
        }
        if (number % divisor == 0) {
            return false;
        }
        if (divisor * divisor > number) {
            return true;
        }
        return isPrime(number, divisor + 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Check if the number is prime using the isPrime method
        boolean isPrime = isPrime(number, 2);

        // Print the result
        if (isPrime) {
            System.out.println(number + " is a PRIME number!");
        } else {
            System.out.println(number + " is NOT a prime number!");
        }
    }
}
