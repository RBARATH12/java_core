package com.learning.core.day7;

import java.util.Stack;

public class D07P06 {
    static class StackWithMin extends Stack<Integer> {
        private Stack<Integer> minStack;

        public StackWithMin() {
            minStack = new Stack<>();
        }

        @Override
        public Integer push(Integer item) {
            if (item <= min()) {
                minStack.push(item);
            }
            return super.push(item);
        }

        @Override
        public synchronized Integer pop() {
            int value = super.pop();
            if (value == min()) {
                minStack.pop();
            }
            return value;
        }

        public int min() {
            if (minStack.isEmpty()) {
                return Integer.MAX_VALUE;
            } else {
                return minStack.peek();
            }
        }
    }

    public static void main(String[] args) {
        StackWithMin stack = new StackWithMin();
        stack.push(5);
        stack.push(2);
        stack.push(7);
        stack.push(1);

        System.out.println("Minimum element in the stack: " + stack.min());
    }
}
