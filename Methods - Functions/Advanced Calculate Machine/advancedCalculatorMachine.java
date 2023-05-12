import java.util.Scanner;

public class AdvancedCalculateMachine2 {

    // The method that performs the addition operation
    public static void performAddition() {
        Scanner scan = new Scanner(System.in);

        double number1, number2, result = 0.0;

        System.out.println("-----------");
        System.out.print("Number 1: ");
        number1 = scan.nextDouble();
        System.out.print("Number 2: ");
        number2 = scan.nextDouble();

        result += number1 + number2;
        System.out.println(number1 + " + " + number2 + " = " + result);
        System.out.println("-----------");
    }

    // The method that performs the subtraction
    public static void performSubtraction() {
        Scanner scan = new Scanner(System.in);

        double number1, number2, result = 0;

        System.out.println("-----------");
        System.out.print("Number 1: ");
        number1 = scan.nextDouble();
        System.out.print("Number 2: ");
        number2 = scan.nextDouble();

        result += number1 - number2;
        System.out.println(number1 + " - " + number2 + " = " + result);
        System.out.println("-----------");
    }

    // The method that performs the multiplication
    public static void performMultiplication() {
        Scanner scan = new Scanner(System.in);

        double number1, number2, result = 0.0;

        System.out.println("-----------");
        System.out.print("Number 1: ");
        number1 = scan.nextDouble();
        System.out.print("Number 2: ");
        number2 = scan.nextDouble();

        result += number1 * number2;
        System.out.println(number1 + " * " + number2 + " = " + result);
        System.out.println("-----------");
    }

    // The method that performs the division operation
    public static void performDivision() {
        Scanner scan = new Scanner(System.in);

        int number1, number2;
        double result = 0.0;

        System.out.println("-----------");
        System.out.print("Number 1: ");
        number1 = (int) scan.nextDouble();
        System.out.print("Number 2: ");
        number2 = (int) scan.nextDouble();

        // Check for division by zero error
        if (number2 != 0) {
            result += (double) number1 / number2;
            System.out.println(number1 + " / " + number2 + " = " + result);
        } else {
            System.out.println("Error: Cannot divide by zero!");
        }
        System.out.println("-----------");
    }

    // Method that performs exponential calculation
    public static void performExponentiation() {
        Scanner scan = new Scanner(System.in);

        int base, exponent, result = 0;

        System.out.println("-----------");
        System.out.print("Base: ");
        base = scan.nextInt();
        System.out.print("Exponent: ");
        exponent = scan.nextInt();

        result += Math.pow(base, exponent);
        System.out.println(base + "^" + exponent + " = " + result);
        System.out.println("-----------");
    }

    // The method that performs the factorial calculation
    public static void performFactorial() {
        Scanner scan = new Scanner(System.in);

        int number;
        long result = 1;

        System.out.println("-----------");
        System.out.print("Number: ");
        number = scan.nextInt();

        // No need to calculate the factorial of negative numbers
        if (number < 0) {
            System.out.println("Error: Cannot calculate factorial of a negative number!");
        } else {
            for (int factor = 2; factor <= number; factor++) {
                result *= factor;
            }

            System.out.println(number + "! = " + result);
        }
        System.out.println("-----------");
    }

    // Method that performs modding
    public static void performModulus() {
        Scanner scan = new Scanner(System.in);

        int dividing, division;
        double result = 0;

        System.out.println("-----------");
        System.out.print("Dividing number: ");
        dividing = scan.nextInt();
        System.out.print("Division number: ");
        division = scan.nextInt();

        // Check for division by zero error
        if (division != 0) {
            result += dividing % division;
            System.out.println(dividing + " % " + division + " = " + result);
        } else {
            System.out.println("Error: Cannot divide by zero!");
        }
        System.out.println("-----------");

    }

    // Method to calculate the area and perimeter of a rectangle
    public static void calculateRectangleAreaAndPerimeter() {
        Scanner scan = new Scanner(System.in);

        double length, width;

        System.out.println("-----------");
        System.out.print("Enter length: ");
        length = scan.nextDouble();
        System.out.print("Enter width: ");
        width = scan.nextDouble();

        if (length > 0 && width > 0) {
            double perimeter = (length + width) * 2;
            double area = length * width;
            System.out.println("Perimeter: " + perimeter);
            System.out.println("Area: " + area);
        } else {
            System.out.println("Error: Invalid dimensions.");
        }
        System.out.println("-----------");
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String menu = "1- Addition\n"
                + "2- Subtraction\n"
                + "3- Multiplication\n"
                + "4- Division\n"
                + "5- Exponentiation\n"
                + "6- Factorial\n"
                + "7- Modulus\n"
                + "8- Rectangle Area and Perimeter Calculation\n"
                + "0- Exit";

        int select;
        do {
            System.out.println(menu);
            System.out.print("Enter the transaction number: ");
            select = scan.nextInt();
            switch (select) {
                case 1:
                    performAddition();
                    break;
                case 2:
                    performSubtraction();
                    break;
                case 3:
                    performMultiplication();
                    break;
                case 4:
                    performDivision();
                    break;
                case 5:
                    performExponentiation();
                    break;
                case 6:
                    performFactorial();
                    break;
                case 7:
                    performModulus();
                    break;
                case 8:
                    calculateRectangleAreaAndPerimeter();
                    break;
                case 0:
                    System.out.println("Exiting...");
                    scan.close();
                    break;
                default:
                    System.out.println("Error: Invalid transaction number.");
                    break;
            }
        } while (select != 0);
    }
}
