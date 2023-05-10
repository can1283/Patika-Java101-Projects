import java.util.Scanner;

public class VatCalculator {
    public static void main(String[] args) {
      
        Scanner input = new Scanner(System.in);
      
        System.out.print("Enter amount: ");
        double amount = input.nextDouble();
      
        // Conditions adjusted according to whether the fee is greater or less than 1000.
        double vatRate = (amount <= 1000) ? 0.18 : 0.08;
        double vatAmount = amount * vatRate;
        double vatAttachedAmount = amount + vatAmount;

        System.out.println("Amount Without VAT: " + amount);
        System.out.println("VAT Amount: " + vatAmount);
        System.out.println("Amount with VAT: " + vatAttachedAmount);
        System.out.println("VAT Rate: " + vatRate);
    }
}
