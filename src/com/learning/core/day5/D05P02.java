package com.learning.core.day5;

import java.util.ArrayList;
import java.util.Scanner;

public class D05P02 {
    public static void main(String[] args) {
        ArrayList<String> studentList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

      
        System.out.println("Enter the number of students:");
        int numberOfStudents = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.print("Enter name of student " + (i + 1) + ": ");
            String name = scanner.nextLine();
            studentList.add(name);
        }

        
        System.out.print("Enter the name to search: ");
        String searchName = scanner.nextLine();

        
        boolean found = false;
        for (String studentName : studentList) {
            if (studentName.equalsIgnoreCase(searchName)) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println(searchName + " is present in the list.");
        } else {
            System.out.println(searchName + " is not present in the list.");
        }

        scanner.close();
    }
}