import java.util.Scanner;

public class CalculateMachine {
    public static void main(String[] args) {
        // add scanner
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter number one: ");
        double num1 = inp.nextInt();
        System.out.print("Enter number two: ");
        double num2 = inp.nextInt();

        // operation type
        String add = "1 - Add ";
        String sub = "2 - Subtract ";
        String div = "3 - Divide ";
        String mul = "4 - Multiply ";
        
        // user selected operation type
        System.out.print("Please select transaction: " + "\n" + add + "\n" + sub + "\n" + div + "\n" + mul + "\n");
        int selected = inp.nextInt();
      
        // conditional expressions
        switch (selected){
            case 1:
                System.out.println((num1 + " + " + num2 + " = ") + (num1 + num2));
                break;
            case 2:
                System.out.println((num1 + " - " + num2 + " = ") + (num1 - num2));
                break;
            case 3:
                System.out.println((num1 + " / " + num2 + " = ") + (num1 / num2));
                break;
            case 4:
                System.out.println((num1 + " * " + num2 + " = ") + (num1 * num2));
                break;
            default:
                System.out.println("Program Error.");
                break;
        }
    }
}
