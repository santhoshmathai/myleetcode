package com.myprogram.stream;

public class TypeInterferenceExample {

	public static void main(String[] args) {
		StringLengthLambda myLambdaStr = s -> s.length();
		System.out.println(myLambdaStr.getLength("HelloLambda"));
	}

	interface StringLengthLambda {
		int getLength(String s);
	}
}
