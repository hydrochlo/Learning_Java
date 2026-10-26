package com.shahadat;

public class Main {
    static void main(String[] args) {
        PayrollSystem payrollSystem = new PayrollSystem();
        FullTimeEmployee emp1 = new FullTimeEmployee("vivik", 40, 100000f);
        PartTimeEmployee emp2 = new PartTimeEmployee("Al-amin", 2, 40, 30);

        payrollSystem.addEmployee(emp1);
        payrollSystem.addEmployee(emp2);

        System.out.println("Initial Employee details: ");
        payrollSystem.displayEmployees();

        System.out.println("Removing Employees");
        payrollSystem.removeEmployee(40);

        System.out.println("Remaining Employees Details: ");
        payrollSystem.displayEmployees();
    }
}
