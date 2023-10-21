package com.myprogram.stream;

public class RunnnableExample {
	public static void main(String[] args) {
		Thread t = new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println("printing ");
				// TODO Auto-generated method stub

			}
		});
		t.start();
		Thread t1 = new Thread(() -> System.out.println("My Lamda runnable"));
		t1.start();
	}
}
