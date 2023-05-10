import java.util.Scanner;
/*
Write a program in Java that calculates the average of numbers divisible by 3 and 4 from 0 up to the entered number, using loops.
*/
public class MultiplesOfThreeAndFour {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = inp.nextInt();

        int sum = 0;
        int count = 0;

        for (int i = 0; i <= number; i++) {
            if (i % 3 == 0 && i % 4 == 0) {
                sum += i;
                count++;
            }
        }

        double average = (double) sum / count;
        System.out.println("Average: " + average);
    }
}
