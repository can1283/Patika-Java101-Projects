# Employee Class

The `Employee` class represents factory employees and provides methods for calculating their salaries. It has 4 attributes and 5 methods.

## Class Attributes
- `name`: The name of the employee.
- `salary`: The salary of the employee.
- `workHours`: The weekly work hours of the employee.
- `hireYear`: The year when the employee started working.

## Class Methods
- `Employee(name, salary, workHours, hireYear)`: Constructor method that takes 4 parameters.
- `tax()`: Calculates the tax amount based on the employee's salary.
- `bonus()`: Calculates the bonus amount for working overtime.
- `raiseSalary()`: Calculates the salary increase based on the years of employment.
- `toString()`: Returns a string representation of the Employee object.

## Example Usage
```java
public class Main {
    public static void main(String[] args) {
        // Create an example employee
        Employee employee = new Employee("kemal", 2000.0, 45, 1985);
        
        // Print the employee's information and calculations
        System.out.println(employee.toString());
    }
}
