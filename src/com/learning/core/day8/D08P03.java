package com.learning.core.day8;

class CircularQueue {
    private int[] queue;
    private int capacity;
    private int front, rear, size;

    public CircularQueue(int capacity) {
        this.capacity = capacity;
        this.queue = new int[capacity];
        this.front = this.rear = -1;
        this.size = 0;
    }

    public void enqueue(int item) {
        if (isFull()) {
            System.out.println("Queue is full. Cannot add more elements.");
            return;
        }
        if (isEmpty()) {
            front = rear = 0;
        } else {
            rear = (rear + 1) % capacity;
        }
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
        if (front == rear) {
            front = rear = -1;
        } else {
            front = (front + 1) % capacity;
        }
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

public class D08P03 {
    public static void main(String[] args) {
        CircularQueue queue = new CircularQueue(4);

        
        queue.enqueue(14);
        queue.enqueue(13);
        queue.enqueue(22);
        queue.enqueue(-8);

        
        queue.display();

        
        queue.dequeue();

       
        queue.display();
    }
}
