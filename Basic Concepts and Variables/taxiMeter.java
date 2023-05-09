import java.util.Scanner;
/*
    1 -> Taximeter costs $2.20 per kilometer.
    2 -> The minimum amount to be paid is $20. $20 will be charged for fees below $20.
    3 -> Taximeter opening fee is 10$.
 */
public class TaxiMeter {
    public static void main(String[] args) {
        // defining variables and including the Scanner class
        int km;
        double perKm = 2.20, total, startPrice = 10;
        Scanner inp = new Scanner(System.in);
        System.out.print("Please enter the distance traveled in km: ");
        km = inp.nextInt();

        // calculate
        total = (km * perKm);
        total += startPrice;

        // task 2 codes
        total = (total < 20) ? 20 : total;

        // output
        System.out.print("Fee payable: " + total);
    }
}
