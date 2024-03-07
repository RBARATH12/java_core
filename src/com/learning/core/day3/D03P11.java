package com.learning.core.day3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class D03P11 {
    
    public static List<String> findMatchingStrings(String[] dictionary, String pattern) {
        List<String> result = new ArrayList<>();
        Map<Character, Character> map = new HashMap<>();
        
        // Iterate over each word in the dictionary
        for (String word : dictionary) {
            // If the lengths of word and pattern are different, continue to the next word
            if (word.length() != pattern.length())
                continue;
            
            // Reset the map for each word
            map.clear();
            boolean isMatch = true;
            
            // Check if the current word matches the pattern
            for (int i = 0; i < word.length(); i++) {
                char wChar = word.charAt(i);
                char pChar = pattern.charAt(i);
                
                if (!map.containsKey(pChar)) {
                    // If the pattern character is not mapped yet, map it to the word character
                    map.put(pChar, wChar);
                } else {
                    // If the pattern character is already mapped, check if it matches the current word character
                    if (map.get(pChar) != wChar) {
                        // If the mapping does not match, set isMatch to false and break
                        isMatch = false;
                        break;
                    }
                }
            }
            
            // If the word matches the pattern, add it to the result list
            if (isMatch)
                result.add(word);
        }
        
        return result;
    }
    
    public static void main(String[] args) {
        String[] dictionary = {"abb", "abc", "xyz", "xyy"};
        String pattern = "abb";
        
        List<String> matchingStrings = findMatchingStrings(dictionary, pattern);
        
        System.out.println("Strings matching the pattern '" + pattern + "':");
        for (String match : matchingStrings) {
            System.out.println(match);
        }
    }
}
