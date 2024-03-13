package com.learning.core.day8;

class Queue {
    private int capacity;
    private int[] queue;
    private int front, rear, size;

    public Queue(int capacity) {
        this.capacity = capacity;
        queue = new int[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }

    public void enqueue(int item) {
        if (isFull()) {
            System.out.println("Queue is full. Cannot add more elements.");
            return;
        }
        rear = (rear + 1) % capacity;
        queue[rear] = item;
        size++;
        System.out.println("Element " + item + " added to queue");
    }

    public void dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot remove elements.");
            return;
        }
        int removedItem = queue[front];
        front = (front + 1) % capacity;
        size--;
        System.out.println("Removed element from queue: " + removedItem);
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return;
        }
        System.out.print("Elements in queue: ");
        int count = 0;
        int index = front;
        while (count < size) {
            System.out.print(queue[index] + " ");
            index = (index + 1) % capacity;
            count++;
        }
        System.out.println();
    }

    private boolean isEmpty() {
        return size == 0;
    }

    private boolean isFull() {
        return size == capacity;
    }
}

public class D08P01 {
    public static void main(String[] args) {
        Queue queue = new Queue(4);

       
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);

       
        queue.display();

       
        queue.dequeue();

       
        queue.display();
    }
}