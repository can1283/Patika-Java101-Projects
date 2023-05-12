import java.util.Scanner;

public class RecursiveNumberManipulation {
    // Recursive method to perform number manipulation
    public static void manipulateNumber(int n) {
        // Base case: If n is 0 or negative, print n and return
        if (n <= 0) {
            System.out.print(n + " ");
            return;
        }
        
        // Print the current value of n
        System.out.print(n + " ");
        
        // Recursive call to subtract 5 from n
        manipulateNumber(n - 5);
        
        // Print the current value of n again
        System.out.print(n + " ");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number (n): ");
        int n = scanner.nextInt();

        // Call the manipulateNumber method with the given number
        manipulateNumber(n);
    }
}
