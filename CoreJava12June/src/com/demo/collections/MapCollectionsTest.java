package com.demo.collections;

import java.util.HashMap;
import java.util.Map;

public class MapCollectionsTest {

	public static void main(String[] args) {
		Employee emp1 = new Employee("rahul", 22);
		Employee emp2 = new Employee("shubham", 27);
		Employee emp3 = new Employee("aman", 23);

		Map<Integer, Employee> employeeMap = new HashMap<>();
		employeeMap.put(1, emp1);
		employeeMap.put(2, emp1);
		employeeMap.put(3, emp3);

		employeeMap.entrySet().stream().forEach(e -> {
			System.out.println(e.getKey());
			System.out.println(e.getValue());
		});

	}

}
