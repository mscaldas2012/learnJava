package edu.msc.structures;

/**
 * Created by mcq1 on 3/24/2016.
 */
public class Queue {
    private static final int capacity = 3;
    int arr[] = new int[capacity];
    int size = 0;
    int top = -1;
    int rear = 0;

    public void push(int pushedElement) {
        if (top < capacity - 1) {
            top++;
            arr[top] = pushedElement;
            System.out.println("Element " + pushedElement + " is pushed to Queue !");
            display();
        } else {
            System.out.println("Queue is Full !");
        }

    }

    public void pop() {
        if (top >= rear) {
            rear++;
            System.out.println("Pop operation done !");
            display();
        } else {
            System.out.println("Queue is Empty !");
        }
    }

    public void display() {
        if (top >= rear) {
            System.out.println("Elements in Queue : ");
            for (int i = rear; i <= top; i++) {
                System.out.println(arr[i]);
            }
        }
    }

    public static void main(String[] args) {
        Queue queueDemo = new Queue();
        queueDemo.pop();
        queueDemo.push(23);
        queueDemo.push(2);
        queueDemo.push(73);
        queueDemo.push(21);
        queueDemo.pop();
        queueDemo.pop();
        queueDemo.pop();
        queueDemo.pop();
    }
}
