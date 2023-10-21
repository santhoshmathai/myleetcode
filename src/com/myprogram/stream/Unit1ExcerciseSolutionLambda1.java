package com.myprogram.stream;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;

public class Unit1ExcerciseSolutionLambda1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Person> lists = Arrays.asList(new Person("Charle", "Dickens", 60), new Person("Lewis", "Carrel", 42),
				new Person("Thomas", "Carley", 51), new Person("AMathew", "Arnold", 45));

		// Sort List by last Name
		NameComparator comparator = new NameComparator();
		Collections.sort(lists, comparator);
		
		// LAMDA  for sortting
		
		Collections.sort(lists, (p1, p2) -> p1.getFirstName().compareTo(p2.getFirstName()));

		
		
		// Lamda for condition 
		
		printConditionally (lists, (p) -> p.getFirstName().startsWith("C"));
		
		printConditionally (lists, (p) -> true);

		// Create a method that prints all the elements in the List.
		printList(lists);
		System.out.println("=========");
		printConditionally(lists, new Condition() {

			@Override
			public boolean test(Person person) {
				// TODO Auto-generated method stub
				return person.getFirstName().startsWith("C");
			}

		});

	}

	public static void printList(List<Person> lists) {
		for (Person person : lists) {
			System.out.println("First name " + person.getFirstName());
			System.out.println("Last Name" + person.getSecondName());
			System.out.println("Age " + person.getAge());

		}
	}

	public static void printConditionally(List<Person> lists, Condition p) {
		for (Person person : lists) {
			if (p.test(person)) {
				System.out.println(person);
			}
		}
	}

	interface Condition {
		boolean test(Person person);
	}
}

class NameComparator implements Comparator<Person> {

	@Override
	public int compare(Person o1, Person o2) {
		// TODO Auto-generated method stub
		return o1.getFirstName().compareTo(o2.getFirstName());
	}
}
