package com.fis.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

//This class demonstrates filtering a map by converting the EntrySet to Stream.
public class MapStreamTest {

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();
		map.put(1, "A");
		map.put(2, "A");
		map.put(3, "B");
		// get count of all keys where value in map is "A"
		Long result = map.entrySet().stream().filter(x -> "A".equals(x.getValue())).map(x -> x.getKey())
				.collect(Collectors.counting());
		System.out.println(result);

		// Get another map from existing map where key is 2
		Map<Integer, String> collect = map.entrySet().stream().filter(x -> x.getKey() == 2)
				.collect(Collectors.toMap(x -> x.getKey(), x -> x.getValue()));
		collect.forEach((k, v) -> {
			System.out.println(k);
			System.out.println(v);
		});
	}

}
