import java.util.Scanner;
/*
    Task:
    Body Mass Index Calculation:
    With Java, take the height and weight values from the user and assign them to a variable. Calculate the user's "Body Mass Index" according to the formula below and print it on the screen.

    Formula:
    Weight (kg) / Height (m) * Height (m)

    Output:
    Please enter your height (in meters): 1.72
    Please enter your weight : 105
    Your Body Mass Index: 35.49215792320173
 */
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
