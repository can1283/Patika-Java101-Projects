import java.util.Scanner;

public class BodyMassIndex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get height and weight from the user
        System.out.print("Please enter your height (in meters): ");
        double height = scanner.nextDouble();
        System.out.print("Please enter your weight: ");
        double weight = scanner.nextDouble();

        // Calculate the body mass index
        double bmi = weight / (height * height);

        // Print the result
        System.out.println("Body Mass Index (BMI): " + bmi);
    }
}
