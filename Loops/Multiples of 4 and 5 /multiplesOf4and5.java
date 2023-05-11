import java.util.Scanner;
public class MultiplesOf4and5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n;
        System.out.print("number: ");
        n = scan.nextInt();
        
        for (int i = 1; i <= n; i *= 4){
            System.out.println(i);
        }
        System.out.println("---");
        for (int i = 1; i <= n; i *= 5){
            System.out.println(i);
        }
    }
}
