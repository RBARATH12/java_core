package com.learning.core.day3;

import java.util.HashSet;
import java.util.Set;

public class D03P12{
    
    public static boolean canSplitIntoFour(String s) {
        int n = s.length();
        
        // Iterate through all possible splitting points
        for (int i = 1; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    // Split the string into four substrings
                    String first = s.substring(0, i);
                    String second = s.substring(i, j);
                    String third = s.substring(j, k);
                    String fourth = s.substring(k);
                    
                    // Check if all substrings are distinct
                    if (!first.equals(second) && !first.equals(third) && !first.equals(fourth)
                            && !second.equals(third) && !second.equals(fourth) && !third.equals(fourth)) {
                        return true; // If all substrings are distinct, return true
                    }
                }
            }
        }
        
        return false; // If no valid splitting is found, return false
    }
    
    public static void main(String[] args) {
        String input = "abcd";
        if (canSplitIntoFour(input)) {
            System.out.println("The string can be split into four different substrings.");
        } else {
            System.out.println("The string cannot be split into four different substrings.");
        }
    }
}
