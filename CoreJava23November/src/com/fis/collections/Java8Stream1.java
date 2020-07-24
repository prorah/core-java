package com.fis.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Java8Stream1 {

	public static void main(String[] args) {
		Person p1 = new Person(27, "X");
		Person p2 = new Person(28, "Y");
		Person p3 = new Person(29, "Z");
		List<Person> list = new ArrayList<>();
		list.add(p1);
		list.add(p2);
		list.add(p3);
		// Predicates can be used to define a condition in java. Predicate
		// defined below sets condition as age greater than
		// or equal to 28.
		Runnable runnable=()->System.out.println("called");
		runnable.run();
		Predicate<Person> pred = p -> p.getAge() >= 28;
		list.forEach(p -> {
			if (pred.test(p)) {
				System.out.println(p.getName());
			}
		}

		);
		
		//The values in the list can also be printed using stream on the collection as below:
		//The below code uses sequential stream
		list.stream().filter(pred).forEach(p->System.out.println(p));

	}

}

class Person {
	private int age;
	private String name;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Person(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}

	public String toString() {
		return name + " " + age;
	}

}
