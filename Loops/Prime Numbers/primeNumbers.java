public class PrimeNumbers {
    public static void main(String[] args) {
        System.out.println("Prime numbers between 1 and 100:");
        // Loop through each number to be checked from 2 to 100
        for (int number = 2; number <= 100; number++) {
            boolean isPrime = true;
            // Loop to check if the number is prime or not, from 2 to the square root of the number
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    // If the number has a divisor other than 1 and itself, it is not prime, so break out of the loop
                    isPrime = false;
                    break;
                }
            }
            // If the number is prime, print it
            if (isPrime) {
                System.out.print(number + " ");
            }
        }
    }
}
