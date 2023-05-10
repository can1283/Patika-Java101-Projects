import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      
        Scanner inp = new Scanner(System.in);
      
        int k, total = 0;

        do {
            System.out.print("Enter number : ");
            k = inp.nextInt();
            if(k % 4 == 0){
                total += k;
            }
        } while (k % 2 == 0);
        System.out.println("Total : " + total);
      
    }
}
