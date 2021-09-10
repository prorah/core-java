package com.demo.collections;

import java.util.HashMap;
import java.util.Map;

public class TestClass {

	public static void main(String[] args) {
		String input = "rahul rajat sachin rajat rahul rahul";
		Map<String, Integer> map = new HashMap<>();
		for (String str : input.split(" ")) {
			if (map.containsKey(str)) {
				map.put(str, map.get(str) + 1);
			} else {
				map.put(str, 1);
			}
		}
		map.entrySet().stream().forEach(e -> {
			System.out.println(e.getKey());
			System.out.println(e.getValue());
		});
	}

}
