package com.corejava.programs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class SortMapByValueTest {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("a", 12);
		map.put("b", 2);
		map.put("c", 52);
		map.put("d", 17);
		map.put("e", 2);
		Set<Entry<String, Integer>> entrySet = map.entrySet();
		List<Entry<String, Integer>> list = new ArrayList<>(entrySet);
		Collections.sort(list, (o1, o2) -> o1.getValue() > o2.getValue() ? 1 : -1);
		list.forEach(l -> System.out.println(l));

	}

}
