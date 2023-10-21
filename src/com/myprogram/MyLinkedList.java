package com.myprogram;

public class MyLinkedList<T> {
	
	private Node <T> head;
	private int size;
	
	public void add(T data) {
		Node<T> newNode = new Node<>(data);
		if (head == null) {
			head = newNode;
		} else {
			Node <T> current = head;
		    while (current.next != null) {
		    	current = current.next;
		    }
		    current.next = newNode;
		}
		size++;
	}
	 
	
	private class Node<T> {
		T data;
		Node<T> next;
		
		Node(T data) {
			this.data = data;
			this.next = null;
		}
	}

}
