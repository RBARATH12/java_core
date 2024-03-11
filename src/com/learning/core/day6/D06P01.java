package com.learning.core.day6;

import java.util.HashMap;
import java.util.Map;

public class D06P01{
    public static void main(String[] args) {
       
        Map<String, String> phoneBook = new HashMap<>();

       
        phoneBook.put("Amal", "998787823");
        phoneBook.put("Manvitha", "937843978");
        phoneBook.put("Joseph", "7882221113");
        phoneBook.put("Smith", "8293893311");
        phoneBook.put("Kathe", "7234560011");

        
        listPhoneBook(phoneBook);
    }

    
    public static void listPhoneBook(Map<String, String> phoneBook) {
        int index = 1;
        System.out.println("Phone Book Details:");
        for (Map.Entry<String, String> entry : phoneBook.entrySet()) {
            System.out.println(index + ". " + entry.getKey() + " " + entry.getValue());
            index++;
        }
    }
}