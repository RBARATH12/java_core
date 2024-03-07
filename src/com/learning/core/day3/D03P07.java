package com.learning.core.day3;

import java.util.ArrayList;
import java.util.List;

public class D03P07{

    public static void main(String[] args) {
        String input = "abc";
        List<String> subsequences = getAllSubsequences(input);
        for (String subsequence : subsequences) {
            System.out.println(subsequence);
        }
    }

    public static List<String> getAllSubsequences(String str) {
        List<String> subsequences = new ArrayList<>();
        generateSubsequences(str, 0, "", subsequences);
        return subsequences;
    }

    private static void generateSubsequences(String str, int index, String current, List<String> subsequences) {
        if (index == str.length()) {
            subsequences.add(current);
            return;
        }
        // Include current character
        generateSubsequences(str, index + 1, current + str.charAt(index), subsequences);
        // Exclude current character
        generateSubsequences(str, index + 1, current, subsequences);
    }
}