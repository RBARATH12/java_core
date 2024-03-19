package com.learning.core.day6;

import java.util.Hashtable;
import java.util.Map;


public class D06P13 {
    public static void main(String[] args) {
        
        Hashtable<Integer, Employee> employeeDetails = new Hashtable<>();

        
        employeeDetails.put(1001, new Employee(1001, "John Doe", "IT", "Software Engineer"));
        employeeDetails.put(1002, new Employee(1002, "Alice Smith", "HR", "HR Manager"));
        employeeDetails.put(1003, new Employee(1003, "Bob Johnson", "Finance", "Accountant"));
        employeeDetails.put(1004, new Employee(1004, "Emily Brown", "Marketing", "Marketing Manager"));

        
        int numberOfKeys = employeeDetails.size();
        System.out.println("Number of keys in the Hashtable: " + numberOfKeys);
    }
}
