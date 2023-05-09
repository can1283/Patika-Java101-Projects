import java.util.Scanner;
import java.text.DecimalFormat;
/*
    Write a program in Java that prints the total amount of the products purchased from the grocery store, according to the kilogram values, to the screen.

    Fruits and KG Prices:
    Pear: 2.14 TL
    Apple : 3.67 TL
    Tomatoes: 1.11 TL
    Banana: 0.95 TL
    Eggplant : 5.00 TL
*/
public class Greengrocer {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // add variable
        double pear = 2.14, apple = 3.67, tomato = 1.11, banana = 0.95, eggplant = 5.00;
        double pearKg, appleKg, tomatoKg, bananaKg, eggplantKg;

        System.out.print("Enter the weight of pears (in kg): ");
        pearKg = input.nextDouble();
        System.out.print("Enter the weight of apples (in kg): ");
        appleKg = input.nextDouble();
        System.out.print("Enter the weight of tomatoes (in kg): ");
        tomatoKg = input.nextDouble();
        System.out.print("Enter the weight of bananas (in kg): ");
        bananaKg = input.nextDouble();
        System.out.print("Enter the weight of eggplants (in kg): ");
        eggplantKg = input.nextDouble();
        
        //calculate total prices
        System.out.println("--- receipt ---");
        double total = (pear * pearKg) + (apple * appleKg) + (tomato * tomatoKg) + (banana * bananaKg) + (eggplant * eggplantKg);
        
        DecimalFormat df = new DecimalFormat("#.##");
        String formattedTotal = df.format(total);
        System.out.println("Total amount: " + formattedTotal);
    }
}
