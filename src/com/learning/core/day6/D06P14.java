package com.learning.core.day6;

import java.util.*;



public class D06P14 {
    public static void main(String[] args) {
        
        Hashtable<Integer, Employee> employeeDetails = new Hashtable<>();

        
        employeeDetails.put(1001, new Employee(1001, "John Doe", "IT", "Software Engineer"));
        employeeDetails.put(1002, new Employee(1002, "Alice Smith", "HR", "HR Manager"));
        employeeDetails.put(1003, new Employee(1003, "Bob Johnson", "Finance", "Accountant"));
        employeeDetails.put(1004, new Employee(1004, "Emily Brown", "Marketing", "Marketing Manager"));

       
        List<Employee> additionalEmployeeDetails = new ArrayList<>();
        additionalEmployeeDetails.add(new Employee(1005, "Sarah Jones", "IT", "System Analyst"));
        additionalEmployeeDetails.add(new Employee(1006, "Michael Wilson", "Finance", "Financial Analyst"));

       
        Collection<Employee> currentEmployees = employeeDetails.values();
        additionalEmployeeDetails.addAll(currentEmployees);

        
        for (Employee employee : additionalEmployeeDetails) {
            System.out.println(employee);
        }
    }
}