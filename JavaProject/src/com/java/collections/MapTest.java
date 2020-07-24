package com.java.collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapTest {

	public static void main(String[] args) {

		Map<Employee1, Integer> map = new LinkedHashMap<>();
		Employee1 e1 = new Employee1(1, "A", 21);
		Employee1 e2 = new Employee1(2, "B", 22);
		Employee1 e3 = new Employee1(3, "C", 23);
		Employee1 e4 = e3;
		Integer b=map.put(e1, 200);
		System.out.println(b);
		Integer c=map.remove(e1);
		System.out.println(c);
		map.put(e2, 300);
		map.put(e3, 400);
		map.put(e4, 500);
		map.forEach((k, v) -> System.out.println(k + "-" + v));
		System.out.println(map.get(e4));

	}

}
