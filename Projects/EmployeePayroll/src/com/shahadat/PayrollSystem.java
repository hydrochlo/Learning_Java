package com.shahadat;

import java.util.ArrayList;

public class PayrollSystem {
    private ArrayList<Employee> employeeList;

    public PayrollSystem() {
        this.employeeList = new ArrayList<>();
    }
    public void addEmployee(Employee employee){
        employeeList.add(employee);
    }
    public void removeEmployee(int id){
        Employee employeeToRemove  = null;
        for(Employee emp: employeeList){
            if(emp.getId()==id){
                employeeToRemove = emp;
                break;
            }
        }
        if(employeeToRemove != null){
            employeeList.remove(employeeToRemove);
        }
    }
    public void displayEmployees(){
        for(Employee emp: employeeList){
            System.out.println(emp);
        }
    }

}
