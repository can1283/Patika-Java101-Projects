package Salary;

public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;

    Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    // Calculates the tax amount based on the salary
    double tax() {
        if (salary <= 1000) {
            return 0;
        } else {
            return salary * 0.03;
        }
    }

    // Calculates the bonus amount for working overtime
    double bonus() {
        int normalWorkHours = 40;
        double hourlyRate = 30;

        if (workHours > normalWorkHours) {
            int extraHours = workHours - normalWorkHours;
            return extraHours * hourlyRate;
        } else {
            return 0;
        }
    }

    // Calculates the salary increase based on the years of employment
    double raiseSalary() {
        int currentYear = 2021;
        int yearsOfWork = currentYear - hireYear;

        if (yearsOfWork < 10) {
            return salary * 0.05;
        } else if (yearsOfWork < 20) {
            return salary * 0.1;
        } else {
            return salary * 0.15;
        }
    }

    // Returns a string representation of the Employee object
    String toPrint() {
        double totalSalary = salary - tax() + bonus() + raiseSalary();

        return "Name: " + name +
                "\nSalary: " + salary +
                "\nWork Hours: " + workHours +
                "\nHire Year: " + hireYear +
                "\nTax: " + tax() +
                "\nBonus: " + bonus() +
                "\nSalary Increase: " + raiseSalary() +
                "\nSalary with Tax and Bonus: " + totalSalary +
                "\nTotal Salary: " + (salary + raiseSalary());
    }

}
