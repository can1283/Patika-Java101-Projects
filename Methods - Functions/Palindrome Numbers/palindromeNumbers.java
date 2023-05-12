import java.util.Scanner;

public class PalindromeNumbers {
    // Method to check if a number is palindrome
    static boolean isPalindrome(int number) {
        int temp = number;
        int reverse = 0;
        int lastDigit;
        
        // Reversing the number
        while (temp != 0) {
            lastDigit = temp % 10;
            reverse = reverse * 10 + lastDigit;
            temp /= 10;
        }
        
        // Checking if the number is equal to its reverse
        if (number == reverse) {
            System.out.println(number + " is a palindrome.");
            return true;
        } else {
            System.out.println(number + " is not a palindrome.");
            return false;
        }
    }
    
    // Method to get user input and call isPalindrome method
    public static void myPalindromeChecker() {
        Scanner myScanner = new Scanner(System.in);

        System.out.print("Enter a number to check if it is a palindrome: ");
        int number = myScanner.nextInt();
        System.out.println(isPalindrome(number));
    }
}
