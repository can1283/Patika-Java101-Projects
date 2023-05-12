## Explanation:

- We use the Scanner class to read the number of rows from the user.
- The outer loop iterates over the rows in reverse order, starting from the rowCount and going down to 1.
- In each iteration of the outer loop, we print spaces before the stars. The number of spaces decreases as we move to the next row (rowCount - i).
- Then, we print the stars. The number of stars is given by the formula 2 * i - 1, where i represents the current row.
- After printing the spaces and stars, we move to the next line using System.out.println() to create a new row.
- This process continues until all the rows have been printed.
