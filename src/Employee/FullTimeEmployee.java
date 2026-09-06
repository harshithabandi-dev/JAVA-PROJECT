package employees;

import payroll.Taxable;

public class FullTimeEmployee extends Employee implements Taxable {

    private double basicSalary;
    private double allowance;

    // Constructor
    public FullTimeEmployee(int employeeId, String name,
                            String designation,
                            double basicSalary, double allowance) {

        super(employeeId, name, designation);

        this.basicSalary = basicSalary;
        this.allowance = allowance;
    }

    // Method overriding
    @Override
    public double calculateSalary() {
        return basicSalary + allowance;
    }

    // Interface method
    @Override
    public double calculateTax() {
        return calculateSalary() * 0.10;
    }

    public void display() {
        displayDetails();

        System.out.println("Employee Type: Full Time");
        System.out.println("Basic Salary: ₹" + basicSalary);
        System.out.println("Allowance: ₹" + allowance);
        System.out.println("Gross Salary: ₹" + calculateSalary());
        System.out.println("Tax: ₹" + calculateTax());
        System.out.println("Net Salary: ₹" +
                (calculateSalary() - calculateTax()));
    }
}