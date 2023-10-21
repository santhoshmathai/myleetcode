package com.myprogram;

import java.util.LinkedList;
import java.util.Queue;

public class Queue1 {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        queue.offer(1); // Enqueue
        queue.offer(2);
        queue.offer(3);

        System.out.println("Front of the queue: " + queue.peek());
        System.out.println("Dequeue: " + queue.poll());
        System.out.println("Front of the queue after dequeue: " + queue.peek());
        System.out.println("Queue size: " + queue.size());
    }
}
