package com.demo.collections;

import java.util.HashMap;
import java.util.Map;

public class HashmapEqualsTest {

	public static void main(String[] args) {
		Map<EmployeeEquals, String> map = new HashMap<>();
		EmployeeEquals emp1 = new EmployeeEquals(1, "rahul");
		EmployeeEquals emp2 = new EmployeeEquals(2, "rajat");
		map.put(emp1, "emp1");
		map.put(emp2, "emp2");

		map.forEach((k, v) -> {
			System.out.println(k);
			System.out.println(v);
		});

	}

}
