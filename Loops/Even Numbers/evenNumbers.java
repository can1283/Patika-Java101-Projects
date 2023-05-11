import java.util.Scanner;
public class EvenNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n, sum = 0;

        do {
            System.out.print("Enter number: ");
            n = scan.nextInt();
            if(n % 4 == 0){
                sum += n;
            }
        } while ((n % 2 == 0) && (n > 0));
        System.out.println("Sum numbers: " + sum);
    }
}
