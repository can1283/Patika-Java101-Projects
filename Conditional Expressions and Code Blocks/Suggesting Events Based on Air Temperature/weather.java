import java.util.Scanner;

public class weather {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the temperature value: ");
        int temperature = scanner.nextInt();

        if (temperature < 5) {
            System.out.println("I suggest going skiing.");
        } else if (temperature >= 5 && temperature <= 15) {
            System.out.println("I suggest going to the cinema.");
        } else if (temperature > 15 && temperature <= 25) {
            System.out.println("I suggest going on a picnic.");
        } else {
            System.out.println("I suggest going swimming.");
        }
    }
}
