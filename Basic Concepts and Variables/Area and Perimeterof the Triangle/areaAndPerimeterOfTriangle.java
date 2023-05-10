import java.util.Scanner;

public class AreaAndEnvironment {
    public static void main(String[] args) {
        int a, b, c;
        double environment, area;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first side length: ");
        a = input.nextInt();
        System.out.print("Enter the second side length: ");
        b = input.nextInt();
        System.out.print("Enter the third side length: ");
        c = input.nextInt();

        environment = a + b + c;
        area = (a * b) / 2.0;

        System.out.println("Environment: " + environment);
        System.out.println("Area: " + area);
    }
}
