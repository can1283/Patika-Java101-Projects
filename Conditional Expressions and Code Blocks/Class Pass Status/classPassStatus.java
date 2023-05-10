import java.util.Scanner;

public class ClassPassStatus {
    public static void main(String[] args) {
        // Add variable
        int math, physics, language, chemistry, music;
        double avg;
        
        // Add Scanner
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your math point: ");
        math = input.nextInt();
        // Conditions to be applied in cases where the score entered by the user is less than 50 or greater than 100.
        if (math < 0 || math > 100) {
            math = 0;
        }
        System.out.print("Enter your physics point: ");
        physics = input.nextInt();
        if (physics < 0 || physics > 100) {
            physics = 0;
        }
        System.out.print("Enter your language point: ");
        language = input.nextInt();
        if (language < 0 || language > 100) {
            language = 0;
        }
        System.out.print("Enter your chemistry point: ");
        chemistry = input.nextInt();
        if (chemistry < 0 || chemistry > 100) {
            chemistry = 0;
        }
        System.out.print("Enter your music point: ");
        music = input.nextInt();
        if (music < 0 || music > 100) {
            music = 0;
        }

        // Calculating the average.
        avg = (double) (math + physics + language + chemistry + music) / 6;
        System.out.println("Your average: " + avg);

        // Condition for passing the class.
        if (avg > 55) {
            System.out.print("You passed the class. Congratulations!");
        } else {
            System.out.print("You did not pass the class.");
        }
    }
}
