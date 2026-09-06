package employees;

public abstract class Employee {

    private final int employeeId;
    private String name;
    private String designation;

    // Constructor
    public Employee(int employeeId, String name, String designation) {
        this.employeeId = employeeId;
        this.name = name;
        this.designation = designation;
    }

    // Getters
    public int getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public String getDesignation() {
        return designation;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    // Abstract method
    public abstract double calculateSalary();

    // Method overloading
    public void displayDetails() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Name: " + name);
        System.out.println("Designation: " + designation);
    }

    public void displayDetails(boolean showSalary) {
        displayDetails();

        if (showSalary) {
            System.out.println("Salary: ₹" + calculateSalary());
        }
    }

    // Object class method overriding
    @Override
    public String toString() {
        return employeeId + " - " + name + " - " + designation;
    }
}