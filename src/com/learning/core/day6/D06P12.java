package com.learning.core.day6;

import java.util.Hashtable;
import java.util.Map;


public class D06P12 {
    public static void main(String[] args) {
        // Create a Hashtable to store employee details with employee ID as the key
        Hashtable<Integer, Employee> employeeDetails = new Hashtable<>();

        // Add predefined information of 4 employee details
        employeeDetails.put(1001, new Employee(1001, "John Doe", "IT", "Software Engineer"));
        employeeDetails.put(1002, new Employee(1002, "Alice Smith", "HR", "HR Manager"));
        employeeDetails.put(1003, new Employee(1003, "Bob Johnson", "Finance", "Accountant"));
        employeeDetails.put(1004, new Employee(1004, "Emily Brown", "Marketing", "Marketing Manager"));

        // Print existing employee details
        System.out.println("Existing Employee Details:");
        for (Map.Entry<Integer, Employee> entry : employeeDetails.entrySet()) {
            System.out.println(entry.getValue());
        }

        // Add some more employees
        employeeDetails.put(1005, new Employee(1005, "Sarah Jones", "IT", "System Analyst"));
        employeeDetails.put(1006, new Employee(1006, "Michael Wilson", "Finance", "Financial Analyst"));

        // Print updated employee details
        System.out.println("\nUpdated Employee Details after adding new employees:");
        for (Map.Entry<Integer, Employee> entry : employeeDetails.entrySet()) {
            System.out.println(entry.getValue());
        }
    }
}
