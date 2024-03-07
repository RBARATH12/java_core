package com.learning.core.day3;

public class D03P08 {
    
    public static int minDeletionsForPalindrome(String s) {
        // Find the length of the longest palindromic subsequence
        int n = s.length();
        int[][] dp = new int[n][n];
        
        // Initialize the DP array
        for (int i = 0; i < n; i++) {
            dp[i][i] = 0;
        }
        
        // Fill the DP array
        for (int len = 2; len <= n; len++) {
            for (int i = 0; i < n - len + 1; i++) {
                int j = i + len - 1;
                if (s.charAt(i) == s.charAt(j)) {
                    dp[i][j] = dp[i + 1][j - 1];
                } else {
                    dp[i][j] = 1 + Math.min(dp[i + 1][j], dp[i][j - 1]);
                }
            }
        }
        
        // Minimum deletions required is the total length of the string minus the length of the longest palindromic subsequence
        return dp[0][n - 1];
    }
    
    public static void main(String[] args) {
        String s = "abcd";
        System.out.println("Minimum deletions required: " + minDeletionsForPalindrome(s));
    }
}
