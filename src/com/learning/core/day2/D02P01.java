package com.learning.core.day2;

import java.util.Scanner;

public class D02P01 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number between 1 to 12: ");
        int monthNumber = scanner.nextInt();

        String monthName = getMonthName(monthNumber);
        if (monthName != null) {
            System.out.println("Month: " + monthName);
        } else {
            System.out.println("Invalid input");
        }
    }

    public static String getMonthName(int monthNumber) {
        String[] monthNames = {"January", "February", "March", "April", "May", "June",
                               "July", "August", "September", "October", "November", "December"};
        if (monthNumber >= 1 && monthNumber <= 12) {
            return monthNames[monthNumber - 1];
        } else {
            return null;
        }
    }

}
