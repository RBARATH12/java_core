package com.learning.core.day7;

import java.util.Stack;

public class D07P04 {
    public static void main(String[] args) {
        String expression = "10+2*6";
        double result = evaluateExpression(expression);
        System.out.println("Output: " + result);
    }

    public static double evaluateExpression(String expression) {
        Stack<Double> operandStack = new Stack<>();
        Stack<Character> operatorStack = new Stack<>();

        for (int i = 0; i < expression.length(); i++) {
            char c = expression.charAt(i);
            if (Character.isDigit(c)) {
                StringBuilder numStr = new StringBuilder();
                numStr.append(c);
                while (i + 1 < expression.length() && Character.isDigit(expression.charAt(i + 1))) {
                    numStr.append(expression.charAt(++i));
                }
                operandStack.push(Double.parseDouble(numStr.toString()));
            } else if (c == '+' || c == '-' || c == '*' || c == '/') {
                while (!operatorStack.isEmpty() && hasPrecedence(c, operatorStack.peek())) {
                    applyOperation(operandStack, operatorStack);
                }
                operatorStack.push(c);
            }
        }

        while (!operatorStack.isEmpty()) {
            applyOperation(operandStack, operatorStack);
        }

        return operandStack.pop();
    }

    private static boolean hasPrecedence(char op1, char op2) {
        if (op2 == '(' || op2 == ')') {
            return false;
        }
        return (op1 != '*' && op1 != '/') || (op2 != '+' && op2 != '-');
    }

    private static void applyOperation(Stack<Double> operandStack, Stack<Character> operatorStack) {
        char operator = operatorStack.pop();
        double operand2 = operandStack.pop();
        double operand1 = operandStack.pop();
        switch (operator) {
            case '+':
                operandStack.push(operand1 + operand2);
                break;
            case '-':
                operandStack.push(operand1 - operand2);
                break;
            case '*':
                operandStack.push(operand1 * operand2);
                break;
            case '/':
                operandStack.push(operand1 / operand2);
                break;
        }
    }
}