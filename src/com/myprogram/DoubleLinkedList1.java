package com.myprogram;

import java.util.LinkedList;

public class DoubleLinkedList1 {
	 public static void main(String[] args) {
	        LinkedList<Integer> deque = new LinkedList<>();

	        // Using LinkedList as a Queue (FIFO)
	        deque.offerLast(1); // Enqueue at the back
	        deque.offerLast(2);
	        deque.offerLast(3);

	        System.out.println("Front of the queue: " + deque.peekFirst());
	        System.out.println("Dequeue: " + deque.pollFirst());
	        System.out.println("Front of the queue after dequeue: " + deque.peekFirst());
	        System.out.println("Queue size: " + deque.size());

	        // Using LinkedList as a Stack (LIFO)
	        deque.offerFirst(4); // Push to the front
	        deque.offerFirst(5);
	        deque.offerFirst(6);

	        System.out.println("\nTop of the stack: " + deque.peekFirst());
	        System.out.println("Pop: " + deque.pollFirst());
	        System.out.println("Top of the stack after pop: " + deque.peekFirst());
	        System.out.println("Stack size: " + deque.size());
	    }
}
