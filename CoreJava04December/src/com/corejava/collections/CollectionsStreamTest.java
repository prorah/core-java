package com.corejava.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class CollectionsStreamTest {

	public static void main(String[] args) {
		Person person1 = new Person("A", 25);
		Person person2 = new Person("B", 26);
		Person person3 = new Person("C", 27);
		List<Person> list = new ArrayList<>();
		list.add(person1);
		list.add(person2);
		list.add(person3);
		Predicate<Person> pred = (person) -> person.getAge() > 25;

		list.stream().filter(pred).map(s -> s.getAge()).forEach(a -> System.out.println(a));

	}

}
