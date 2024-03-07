package com.learning.core.day3;

public class D03P13{
    public static void main(String[] args) {
        String originalString = "Mr John Smith";
        String urlifiedString = replaceSpaces(originalString);
        System.out.println("Original String: " + originalString);
        System.out.println("URLified String: " + urlifiedString);
    }

    public static String replaceSpaces(String str) {
        // Count the number of spaces in the string
        int spaceCount = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                spaceCount++;
            }
        }

        // Calculate the new length of the string after replacement
        int newLength = str.length() + (spaceCount * 2);
        char[] urlified = new char[newLength];
        
        // Replace spaces with "%20"
        int index = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                urlified[index++] = '%';
                urlified[index++] = '2';
                urlified[index++] = '0';
            } else {
                urlified[index++] = str.charAt(i);
            }
        }
        return new String(urlified);
    }
}
