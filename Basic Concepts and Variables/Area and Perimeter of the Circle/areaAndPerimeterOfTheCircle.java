import java.util.Scanner;
/*
    Task:
    Write a program that finds the area of a slice of circle with radius r and measure 𝛼 of the central angle.
    Take 𝜋 = 3.14.
    Formula : (𝜋 * (r*r) * 𝛼) / 360
 */
public class AreaAndPerimeterOfTheCircle {
    public static void main(String[] args) {
        double pi = 3.14;

        // Get the radius and central angle from the user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the radius: ");
        double radius = scanner.nextDouble();
        System.out.print("Enter the central angle: ");
        double centralAngle = scanner.nextDouble();

        // Calculate the area of the slice
        double area = (pi * radius * radius * centralAngle) / 360;

        // Print the result to the console
        System.out.println("Slice Area: " + area);
    }
}
