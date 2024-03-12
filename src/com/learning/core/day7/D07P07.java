package com.learning.core.day7;

import java.util.Stack;

public class D07P07{
    public static boolean isTopElementEven(Stack<Integer> stack) {
        if (stack.isEmpty()) {
                       return false;
        }
        int topElement = stack.peek();
        return topElement % 2 == 0;
    }

    public static void main(String[] args) {
        
        Stack<Integer> stack = new Stack<>();
        stack.push(5);
        stack.push(10);
        stack.push(7);
        stack.push(4);

        boolean result = isTopElementEven(stack);
        System.out.println("Is top element even? " + result); 
    }
}