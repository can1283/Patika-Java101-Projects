import java.util.Scanner;

public class HoroscopeFinder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
      
        // Show the horoscope ranges and numbers to the user.
        System.out.println("1 -> 21 March - 20 April");
        System.out.println("2 -> 21 April - 21 May");
        System.out.println("3 -> 22 May - 22 June");
        System.out.println("4 -> 23 June - 22 July");
        System.out.println("5 -> 23 July - 22 August");
        System.out.println("6 -> 23 August - 22 September");
        System.out.println("7 -> 23 September - 22 October");
        System.out.println("8 -> 23 October - 22 November");
        System.out.println("9 -> 23 November - 21 December");
        System.out.println("10 -> 22 December - 21 January");
        System.out.println("11 -> 22 January - 19 February");
        System.out.println("12 -> 20 February - 20 March");
        System.out.print("Please select the range you were born in: ");
        int selectedRange = input.nextInt();

        // The correct sign is printing according to the selected range.
        if (selectedRange == 1) {
            System.out.print("Aries");
        } else if (selectedRange == 2) {
            System.out.print("Taurus");
        } else if (selectedRange == 3) {
            System.out.print("Gemini");
        } else if (selectedRange == 4) {
            System.out.print("Cancer");
        } else if (selectedRange == 5) {
            System.out.print("Leo");
        } else if (selectedRange == 6) {
            System.out.print("Virgo");
        } else if (selectedRange == 7) {
            System.out.print("Libra");
        } else if (selectedRange == 8) {
            System.out.print("Scorpio");
        } else if (selectedRange == 9) {
            System.out.print("Sagittarius");
        } else if (selectedRange == 10) {
            System.out.print("Capricorn");
        } else if (selectedRange == 11) {
            System.out.print("Aquarius");
        } else if (selectedRange == 12) {
            System.out.print("Pisces");
        } else {
            System.out.println("Please enter numbers 1 to 12 only.");
        }
    }
}
