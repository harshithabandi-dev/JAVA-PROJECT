package employees;

import payroll.Taxable;

public class PartTimeEmployee extends Employee implements Taxable {

    private int hoursWorked;
    private double hourlyRate;

    // Constructor
    public PartTimeEmployee(int employeeId, String name,
                            String designation,
                            int hoursWorked, double hourlyRate) {

        super(employeeId, name, designation);

        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    // Method overriding
    @Override
    public double calculateSalary() {
        return hoursWorked * hourlyRate;
    }

    // Interface method
    @Override
    public double calculateTax() {
        return calculateSalary() * 0.05;
    }

    public void display() {
        displayDetails();

        System.out.println("Employee Type: Part Time");
        System.out.println("Hours Worked: " + hoursWorked);
        System.out.println("Hourly Rate: ₹" + hourlyRate);
        System.out.println("Gross Salary: ₹" + calculateSalary());
        System.out.println("Tax: ₹" + calculateTax());
        System.out.println("Net Salary: ₹" +
                (calculateSalary() - calculateTax()));
    }
}