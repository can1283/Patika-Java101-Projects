import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements in the Fibonacci series: ");
        int elementCount = scanner.nextInt();

        int number1 = 0;
        int number2 = 1;

        System.out.println("Fibonacci Series with " + elementCount + " elements:");
        System.out.print(number1 + " " + number2 + " ");

        // Calculate Fibonacci series without using arrays
        for (int i = 3; i <= elementCount; i++) {
            int newNumber = number1 + number2;
            System.out.print(newNumber + " ");
            number1 = number2;
            number2 = newNumber;
        }
    }
}
