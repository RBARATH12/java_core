package com.learning.core.day7;

class Stack {
    private int maxSize;
    private String[] stackArray;
    private int top;

    public Stack(int size) {
        this.maxSize = size;
        this.stackArray = new String[maxSize];
        this.top = -1;
    }

    public void push(String element) {
        if (isFull()) {
            System.out.println("Stack is full. Cannot push element: " + element);
            return;
        }
        stackArray[++top] = element;
    }

    public String pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Cannot pop element.");
            return null;
        }
        return stackArray[top--];
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFull() {
        return (top == maxSize - 1);
    }

    public void display() {
        System.out.print("Stack: ");
        for (int i = top; i >= 0; i--) {
            System.out.print(stackArray[i] + " ");
        }
        System.out.println();
    }
}

public class D07P01 {
    public static void main(String[] args) {
        Stack stack = new Stack(5);

        stack.push("Hello");
        stack.push("world");
        stack.push("Java");
        stack.push("Programming");

        System.out.print("After push 4 Elements: ");
        stack.display();

        stack.pop(); // Pop one element

        System.out.print("After a pop: ");
        stack.display();
    }
}
