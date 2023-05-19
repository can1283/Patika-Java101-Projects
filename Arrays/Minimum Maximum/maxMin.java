import java.util.Scanner;
import java.util.Arrays;

public class MaxMin {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter value: ");
        int userValue = scan.nextInt();
        
        int[] arr = {1, 5, 33, 67, 9, 21, 63, 84, 21, 23};
        int max = userValue;
        Arrays.sort(arr);
        
        for (int i : arr) {
            if (i > userValue) {
                max = i;
                break;
            }
        }

        int min = Integer.MIN_VALUE;
        for (int num : arr) {
            if (num < userValue && num > min) {
                min = num;
            }
        }

        System.out.println("The nearest number greater than the entered number: " + max);
        System.out.println("The nearest number smaller than the entered number: " + min);
    }
}
