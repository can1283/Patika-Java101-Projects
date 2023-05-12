## Project Details:
This Java program implements a recursive method to perform number manipulation based on the given rule.

The manipulateNumber method takes an integer n as a parameter. It starts by checking if n is 0 or negative. If so, it prints n and returns, ending the recursion. Otherwise, it prints the current value of n, recursively calls itself with n - 5, and then prints the current value of n again. This ensures that the number manipulation is performed in the desired sequence.

In the main method, the user is prompted to enter a number (n). The manipulateNumber method is then called with the given number. The method performs the number manipulation recursively based on the rule and prints the intermediate values as requested.

Please note that this program assumes positive integer inputs. Negative values will be treated as 0.
