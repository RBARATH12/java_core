package com.learning.core.day3;

import java.util.Scanner;

public class D03P06 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = scanner.nextLine();
        System.out.println("Enter the number of vowels to count:");
        int n = scanner.nextInt();
        scanner.close();
        
        int vowelCount = countLastNVowels(input, n);
        
        if (vowelCount != -1) {
            System.out.println("Count of last " + n + " vowels: " + vowelCount);
        } else {
            System.out.println("Mismatch in the vowel count. The string doesn't contain enough vowels.");
        }
    }
    
    public static int countLastNVowels(String str, int n) {
        int count = 0;
        for (int i = str.length() - 1; i >= 0; i--) {
            char ch = Character.toLowerCase(str.charAt(i));
            if (isVowel(ch)) {
                count++;
                if (count == n) {
                    return n;
                }
            }
        }
        return -1;
    }
    
    public static boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}