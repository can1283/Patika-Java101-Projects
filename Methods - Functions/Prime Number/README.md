## Project Details:
This Java program determines if a given number is prime or not using a recursive method.

The isPrime method takes two parameters: number (the number to be checked) and divisor (the current divisor being checked). The method checks if the number is less than or equal to 2 and returns true if it is 2, as 2 is the only even prime number. If the number is divisible by the current divisor without leaving a remainder, the method returns false, indicating that the number is not prime. If the square of the current divisor is greater than the number, the method returns true, indicating that the number is prime. Otherwise, it calls itself recursively with the incremented divisor.

In the main method, the user is prompted to enter a number. The isPrime method is then called with the given number and an initial divisor of 2. The result is stored in the isPrime variable. Finally, the program prints whether the number is prime or not based on the value of isPrime.

Please note that this program assumes positive integer inputs.
