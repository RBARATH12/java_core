package com.learning.core.day8;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class Queue1 {
    private Node front, rear;

    public Queue1() {
        front = rear = null;
    }

    public void enqueue(int data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        System.out.println("Element " + data + " added to queue");
    }

    public void dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot remove elements.");
            return;
        }
        int removedItem = front.data;
        front = front.next;
        if (front == null) {
            rear = null;
        }
        System.out.println("Removed element from queue: " + removedItem);
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return;
        }
        Node current = front;
        System.out.print("Elements in queue: ");
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    private boolean isEmpty() {
        return front == null;
    }
}

public class D08P02 {
    public static void main(String[] args) {
        Queue1 queue = new Queue1();

       
        queue.enqueue(89);
        queue.enqueue(99);
        queue.enqueue(109);
        queue.enqueue(209);
        queue.enqueue(309);

        
        queue.display();

       
        queue.dequeue();
        queue.dequeue();

        
        queue.display();
    }
}