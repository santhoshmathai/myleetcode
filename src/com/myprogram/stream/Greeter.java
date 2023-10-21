package com.myprogram.stream;

public class Greeter {
	
	public void greet() {
		// TODO Auto-generated method stub
		System.out.println("Hello world");

	}
	public static void main(String[] args) {
		Greeter greeter = new Greeter();
		//greeter.greet();
		
		
		Greeting greeting =  new GreetingImpl();
		greeting.perform();
		
		Greeting myLamdaGreeting = () -> System.out.println("Hello world");
		myLamdaGreeting.perform();
	}
	
	interface MyLamda {
		void foo();
	}
	
	
}
