package com.fis.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamTest {

	public static void main(String[] args) {
		List<Integer> list1 = new ArrayList<>();
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(4);
		// Get all values from list greater than 2 and collect them into a set.
		// Collectors are basically used to collect the data into the specified
		// collection.
		Set<Integer> set = list1.stream().filter(p -> p > 2).collect(Collectors.toSet());
		set.forEach(p -> System.out.println(p));

	}

}
