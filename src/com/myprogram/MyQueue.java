package com.myprogram;

import java.util.LinkedList;

public class MyQueue<T> {

	LinkedList<T> queue = new LinkedList<T>();
	
	public void dnqueue(T value) {
		queue.addLast(value);
	}
	
	public T enqueue() {
		if (queue.isEmpty()) {
			throw new IllegalArgumentException();
		}
		return queue.removeFirst(); 
	}
}
