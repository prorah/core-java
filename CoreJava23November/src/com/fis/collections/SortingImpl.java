package com.fis.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingImpl {

	public static void main(String[] args) {
		Employee emp1 = new Employee("b", 26);
		Employee emp2 = new Employee("d", 27);
		Employee emp3 = new Employee("c", 28);

		List<Employee> sortingList = new ArrayList<>();
		sortingList.add(emp1);
		sortingList.add(emp2);
		sortingList.add(emp3);
		Collections.sort(sortingList);
		sortingList.forEach(employee -> {
			System.out.println(employee.getName() + "-" + employee.getAge());
		});
		System.out.println(Collections.binarySearch(sortingList, emp1));
	}
}
