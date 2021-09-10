package com.corejava.programs;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DistinctWordTest {

	public static void main(String[] args) {
		String inputString = "abc bca abc bca cda";
		String[] splitArr = inputString.split(" ");
		Map<String, Integer> map = new HashMap<>();
		for (String str : splitArr) {
			if (map.containsKey(str)) {
				map.put(str, map.get(str) + 1);
			} else {
				map.put(str, 1);
			}
		}
		System.out.println(map);
		Set<Entry<String, Integer>> set = map.entrySet();
		for (Entry<String, Integer> entry : set) {
			if (entry.getValue() > 1) {
				System.out.println(entry.getKey());
			}
		}
	}

}
