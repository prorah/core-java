package com.demo.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ListCollectionsTest {
	public static void main(String[] args) {
		Employee emp1 = new Employee("rahul", 22);
		Employee emp2 = new Employee("shubham", 27);
		Employee emp3 = new Employee("aman", 23);

		List<Employee> employeeList = new ArrayList<Employee>();
		employeeList.add(emp1);
		employeeList.add(emp2);
		employeeList.add(emp3);
		Collections.sort(employeeList);
		Iterator<Employee> itr = employeeList.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}
}
