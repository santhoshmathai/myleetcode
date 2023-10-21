package com.myprogram.stream;

public class Person {

	public String firstName;
	public String secondName;
	public int age;

	public Person(String firstName, String secondName, int age) {
		super();
		this.firstName = firstName;
		this.secondName = secondName;
		this.age = age;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getSecondName() {
		return secondName;
	}

	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Person() {
		// TODO Auto-generated constructor stub
	}

}
