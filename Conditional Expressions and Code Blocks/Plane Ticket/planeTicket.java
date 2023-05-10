import java.util.Scanner;

public class PlaneTicket {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get the distance from the user
        System.out.print("Enter the distance (in km): ");
        int distance = input.nextInt();

        // Get the age from the user
        System.out.print("Enter your age: ");
        int age = input.nextInt();

        // Get the travel type from the user
        System.out.print("Enter the travel type (1 => One-way, 2 => Round-trip): ");
        int travelType = input.nextInt();

        // Check if the inputs are valid
        if (distance > 0 && age > 0 && (travelType == 1 || travelType == 2)) {
            // Calculate the base price
            double basePrice = distance * 0.10;

            // Calculate the discounted price based on age
            double discountedPrice = basePrice;

            if (age < 12) {
                discountedPrice -= basePrice * 0.50;
            } else if (age >= 12 && age <= 24) {
                discountedPrice -= basePrice * 0.10;
            } else if (age >= 65) {
                discountedPrice -= basePrice * 0.30;
            }

            // Apply round-trip discount if applicable
            if (travelType == 2) {
                discountedPrice -= discountedPrice * 0.20;
            }

            // Calculate the total price
            double totalPrice = discountedPrice;

            if (travelType == 2) {
                totalPrice *= 2;
            }

            // Display the total price to the user
            System.out.println("Total Price = " + totalPrice + "$");
        } else {
            // Display an error message for invalid inputs
            System.out.println("Invalid Input!");
        }
    }
}
