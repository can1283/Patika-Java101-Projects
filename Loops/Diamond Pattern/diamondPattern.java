import java.util.Scanner;

public class DiamondPattern {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows (odd): ");
        int rows = scanner.nextInt();

        scanner.close();

        int spaces = rows / 2;
        int stars = 1;

        // Print the upper half of the diamond
        for (int i = 0; i < rows / 2 + 1; i++) {
            // Print spaces
            for (int j = 0; j < spaces; j++) {
                System.out.print(" ");
            }

            // Print stars
            for (int j = 0; j < stars; j++) {
                System.out.print("*");
            }

            System.out.println();
            spaces--;
            stars += 2;
        }

        spaces = 1;
        stars = rows - 2;

        // Print the lower half of the diamond
        for (int i = 0; i < rows / 2; i++) {
            // Print spaces
            for (int j = 0; j < spaces; j++) {
                System.out.print(" ");
            }

            // Print stars
            for (int j = 0; j < stars; j++) {
                System.out.print("*");
            }

            System.out.println();
            spaces++;
            stars -= 2;
        }
    }
}
