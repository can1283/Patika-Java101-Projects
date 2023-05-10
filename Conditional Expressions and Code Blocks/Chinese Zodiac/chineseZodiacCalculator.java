import java.util.Scanner;

public class ChineseZodiacCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int birthYear;
        System.out.print("Please enter your birth year: ");
        birthYear = input.nextInt();

        // Checking if the input birth year is negative
        if (birthYear < 0) {
            System.out.println("Error! Invalid birth year.");
        } else {
            // Calculating the Chinese zodiac based on the birth year
            switch (birthYear % 12) {
                case 0:
                    System.out.print("Chinese zodiac: Monkey.");
                    break;
                case 1:
                    System.out.print("Chinese zodiac: Rooster.");
                    break;
                case 2:
                    System.out.print("Chinese zodiac: Dog.");
                    break;
                case 3:
                    System.out.print("Chinese zodiac: Pig.");
                    break;
                case 4:
                    System.out.print("Chinese zodiac: Rat.");
                    break;
                case 5:
                    System.out.print("Chinese zodiac: Ox.");
                    break;
                case 6:
                    System.out.print("Chinese zodiac: Tiger.");
                    break;
                case 7:
                    System.out.print("Chinese zodiac: Rabbit.");
                    break;
                case 8:
                    System.out.print("Chinese zodiac: Dragon.");
                    break;
                case 9:
                    System.out.print("Chinese zodiac: Snake.");
                    break;
                case 10:
                    System.out.print("Chinese zodiac: Horse.");
                    break;
                case 11:
                    System.out.print("Chinese zodiac: Goat.");
                    break;
                default:
                    System.out.print("Error! Invalid birth year.");
                    break;
            }
        }
    }
}
