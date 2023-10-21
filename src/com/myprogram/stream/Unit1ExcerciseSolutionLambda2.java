package com.myprogram.stream;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

public class Unit1ExcerciseSolutionLambda2 {

	
	
	public Unit1ExcerciseSolutionLambda2() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Person> lists = Arrays.asList(new Person("Charle", "Dickens", 60), 
				new Person("Lewis", "Carrel", 42),
				new Person("Thomas", "Carley", 51), 
				new Person("AMathew", "Arnold", 45),
				new Person("DMathew", "Arnold", 45));

		
		// 1.  sort the list using Lamda
		
		Collections.sort(lists, (p1, p2) -> p1.getFirstName().compareTo(p2.getFirstName()));
		
		// 2. Print the list using lamda
		
		printWithCondition(lists, (p) -> true);

		
		
		// 3. Print the list by condition using lamda
		printWithCondition(lists, (p) -> p.getFirstName().startsWith("C"));
		printWithCondition(lists, (p) -> p.getFirstName().startsWith("A"));
		


		
		
	}
	
	public static  void printWithCondition(List<Person> lists, Predicate<Person> c) {
		for (Person p : lists) {
			if (c.test(p)) {
				System.out.println(p.getFirstName());
				System.out.println(p.getSecondName());
				System.out.println(p.getAge());


			}
		}
	}
	
	/*
	 * interface Condition { boolean test(Person p); }
	 */

}
