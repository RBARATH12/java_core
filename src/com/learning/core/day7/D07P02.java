package com.learning.core.day7;

class Node {
    double data;
    Node next;

    public Node(double data) {
        this.data = data;
        this.next = null;
    }
}

class Stack1{
    private Node top;

    public Stack1() {
        this.top = null;
    }

    public void push(double data) {
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
    }

    public double pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Cannot pop element.");
            return Double.NaN;
        }
        double poppedValue = top.data;
        top = top.next;
        return poppedValue;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public void display() {
        Node current = top;
        System.out.print("The elements of the stack are: ");
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println("null");
    }
}

public class D07P02 {
    public static void main(String[] args) {
        Stack1 stack = new Stack1();

        // Pushing input elements onto the stack
        stack.push(10.0);
        stack.push(20.0);
        stack.push(30.0);
        stack.push(40.0);

        stack.display();

        // Popping twice
        stack.pop();
        stack.pop();

        System.out.print("After popping twice: ");
        stack.display();
    }
}