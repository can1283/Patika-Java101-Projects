import java.util.Scanner;

public class SortingNumbers {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int a, b, c;

        // Prompt the user to enter three numbers
        System.out.print("Enter the first number: ");
        a = input.nextInt();
        System.out.print("Enter the second number: ");
        b = input.nextInt();
        System.out.print("Enter the third number: ");
        c = input.nextInt();

        // Check and arrange the numbers in descending order
        if (a >= b && a >= c) {
            if (b >= c) {
                System.out.println("Descending order: " + a + " > " + b + " > " + c);
            } else {
                System.out.println("Descending order: " + a + " > " + c + " > " + b);
            }
        } else if (b >= a && b >= c) {
            if (a >= c) {
                System.out.println("Descending order: " + b + " > " + a + " > " + c);
            } else {
                System.out.println("Descending order: " + b + " > " + c + " > " + a);
            }
        } else {
            if (a >= b) {
                System.out.println("Descending order: " + c + " > " + a + " > " + b);
            } else {
                System.out.println("Descending order: " + c + " > " + b + " > " + a);
            }
        }

    }
}
