package com.fis.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsTest {

	public static void main(String[] args) {
		Employee emp1 = new Employee("a");
		Employee emp2 = new Employee("b");
		Employee emp3 = new Employee("c");
		List<Employee> list = new ArrayList<>();
		list.add(emp1);
		list.add(emp2);
		list.add(emp3);
		Collections.sort(list);

		list.forEach((k) -> System.out.println(k));

	}

}
