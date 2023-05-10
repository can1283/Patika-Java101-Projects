## **Project Details:**
The program follows the following steps to calculate the ticket price:

1. The user is prompted to enter the distance of the flight in kilometers.
2. The user is prompted to enter their age.
3. The user is prompted to enter the travel type, where 1 represents one-way and 2 represents round-trip.
4. The program checks if the input values are valid: the distance and age should be positive integers, and the travel type should be either 1 or 2.
5. If the input values are valid, the program calculates the base price by multiplying the distance by 0.10 (representing the cost per kilometer).
6. The program applies discounts based on the age of the passenger:
    - If the age is less than 12, a 50% discount is applied to the base price.
    - If the age is between 12 and 24 (inclusive), a 10% discount is applied to the base price.
    - If the age is 65 or above, a 30% discount is applied to the base price.
7. If the travel type is round-trip (2), an additional 20% discount is applied to the discounted price.
8. The program calculates the total price based on the discounted price. If the travel type is round-trip, the total price is doubled.
9. The program displays the total price to the user.  
  
The "Plane Ticket" provides a simple and efficient way to calculate ticket prices for various distances and passenger ages. It incorporates conditional statements and mathematical operations to determine the final price based on different factors. By using this program, users can quickly calculate the cost of their airplane tickets, taking advantage of discounts based on age and travel type.
