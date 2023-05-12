import java.util.Scanner;
public class Triangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int rowCount = scanner.nextInt();
        // Loop for rows
        for (int i = rowCount; i >= 1; i--) {
            // Print spaces before the stars
            for (int j = 0; j < rowCount - i; j++) {
                System.out.print(" ");
            }
            // Print stars
            for (int j = 0; j < 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
