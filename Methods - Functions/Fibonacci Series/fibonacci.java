public class Fibonacci {
    // Recursive method to calculate the Fibonacci number
    public static int fibonacci(int n) {
        // Base case: if n is 1 or 2, return 1
        if (n == 1 || n == 2) {
            return 1;
        }
        
        // Recursive case: calculate Fibonacci number using previous two numbers
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
    
    public static void main(String[] args) {
        // Printing the 10th Fibonacci number
        System.out.println(fibonacci(10));
    }
}
