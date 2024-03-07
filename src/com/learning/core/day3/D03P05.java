package com.learning.core.day3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class D03P05{

    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums); // Sort the array to handle duplicates

        backtrack(nums, target, 0, new ArrayList<>(), result);
        return result;
    }

    private void backtrack(int[] nums, int target, int start, List<Integer> path, List<List<Integer>> result) {
        if (target == 0) {
            result.add(new ArrayList<>(path));
            return;
        }

        for (int i = start; i < nums.length; i++) {
            if (nums[i] > target) {
                break; // Stop the loop if the current number is greater than the target
            }

            path.add(nums[i]);
            backtrack(nums, target - nums[i], i, path, result); // Recur with the remaining target
            path.remove(path.size() - 1); // Backtrack by removing the last added number
        }
    }

    public static void main(String[] args) {
        D03P05 cs = new D03P05();
        int[] nums = {2, 3, 6, 7};
        int target = 7;
        List<List<Integer>> combinations = cs.combinationSum(nums, target);
        for (List<Integer> combination : combinations) {
            System.out.println(combination);
        }
    }
}
