package com.learning.core.day3;

public class D03P10 {
    
    public static int longestPrefixSuffix(String s) {
        int n = s.length();
        int[] lps = new int[n];
        
        // Calculate the Longest Prefix Suffix
        int len = 0; // Length of the previous longest prefix suffix
        int i = 1;
        lps[0] = 0; // lps[0] is always 0
        
        while (i < n) {
            if (s.charAt(i) == s.charAt(len)) {
                len++;
                lps[i] = len;
                i++;
            } else {
                if (len != 0) {
                    len = lps[len - 1];
                } else {
                    lps[i] = 0;
                    i++;
                }
            }
        }
        
        // The length of the longest prefix which is also a suffix
        return lps[n - 1];
    }
    
    public static void main(String[] args) {
        String s = "ababc";
        int result = longestPrefixSuffix(s);
        System.out.println("Length of longest prefix which is also a suffix: " + result);
    }
}
