import java.util.Scanner;

public class GradeAverage {
    public static void main(String[] args) {
        // create variable
        int math, history, physics, chemistry, language, music;

        // add scanner
        Scanner input = new Scanner(System.in);

        // get values from user
        System.out.print("Enter your math score: ");
        math = input.nextInt();

        System.out.print("Enter your history score: ");
        history = input.nextInt();

        System.out.print("Enter your physics score: ");
        physics = input.nextInt();

        System.out.print("Enter your chemistry score: ");
        chemistry = input.nextInt();

        System.out.print("Enter your language score: ");
        language = input.nextInt();

        System.out.print("Enter your music score: ");
        music = input.nextInt();

        // giving the result
        int sum = (math + history + physics + chemistry + language + music);
        double result = sum / 6;
        System.out.println("Your average: " + ((result >= 60)? + result + ". You passed." : + result + ". You couldn't pass."));
    }
}
