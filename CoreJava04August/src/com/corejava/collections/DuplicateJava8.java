package com.corejava.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicateJava8 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("a");
		list.add("b");
		list.add("b");
		list.add("b");

		Set<String> dupSet = list.stream().collect(Collectors.toSet());

		dupSet.forEach(x -> System.out.println(x));

	}

}
