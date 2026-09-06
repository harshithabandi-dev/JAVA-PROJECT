package payroll;

import java.util.Scanner;
import employees.Employee;
import employees.FullTimeEmployee;
import employees.PartTimeEmployee;

public class PayrollSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Array of Employee objects
        Employee[] employees = new Employee[100];

        int count = 0;

        while (true) {

            System.out.println("\n================================");
            System.out.println("   EMPLOYEE PAYROLL SYSTEM");
            System.out.println("================================");
            System.out.println("1. Add Full-Time Employee");
            System.out.println("2. Add Part-Time Employee");
            System.out.println("3. Display All Employees");
            System.out.println("4. Search Employee");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:

                    System.out.print("Enter Employee ID: ");
                    int id1 = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Name: ");
                    String name1 = sc.nextLine();

                    System.out.print("Enter Designation: ");
                    String designation1 = sc.nextLine();

                    System.out.print("Enter Basic Salary: ");
                    double basicSalary = sc.nextDouble();

                    System.out.print("Enter Allowance: ");
                    double allowance = sc.nextDouble();

                    employees[count] =
                            new FullTimeEmployee(
                                    id1,
                                    name1,
                                    designation1,
                                    basicSalary,
                                    allowance
                            );

                    count++;

                    System.out.println(
                            "Full-Time Employee Added Successfully!"
                    );

                    break;

                case 2:

                    System.out.print("Enter Employee ID: ");
                    int id2 = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Name: ");
                    String name2 = sc.nextLine();

                    System.out.print("Enter Designation: ");
                    String designation2 = sc.nextLine();

                    System.out.print("Enter Hours Worked: ");
                    int hours = sc.nextInt();

                    System.out.print("Enter Hourly Rate: ");
                    double rate = sc.nextDouble();

                    employees[count] =
                            new PartTimeEmployee(
                                    id2,
                                    name2,
                                    designation2,
                                    hours,
                                    rate
                            );

                    count++;

                    System.out.println(
                            "Part-Time Employee Added Successfully!"
                    );

                    break;

                case 3:

                    if (count == 0) {

                        System.out.println(
                                "No employees found."
                        );

                    } else {

                        System.out.println(
                                "\n----- EMPLOYEE DETAILS -----"
                        );

                        for (int i = 0; i < count; i++) {

                            System.out.println(
                                    "\nEmployee " + (i + 1)
                            );

                            employees[i].displayDetails(true);

                            System.out.println(
                                    "----------------------------"
                            );
                        }
                    }

                    break;

                case 4:

                    System.out.print(
                            "Enter Employee ID to search: "
                    );

                    int searchId = sc.nextInt();

                    boolean found = false;

                    for (int i = 0; i < count; i++) {

                        if (employees[i].getEmployeeId()
                                == searchId) {

                            System.out.println(
                                    "\nEmployee Found!"
                            );

                            System.out.println(
                                    employees[i]
                            );

                            System.out.println(
                                    "Salary: ₹"
                                    + employees[i]
                                    .calculateSalary()
                            );

                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println(
                                "Employee not found."
                        );
                    }

                    break;

                case 5:

                    System.out.println(
                            "Thank you for using Payroll System!"
                    );

                    sc.close();
                    return;

                default:

                    System.out.println(
                            "Invalid choice!"
                    );
            }
        }
    }
}