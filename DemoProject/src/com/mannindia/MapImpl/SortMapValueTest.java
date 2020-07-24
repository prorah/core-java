package com.mannindia.MapImpl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

//This program demonstrates sorting a map by value
public class SortMapValueTest {

	public static void main(String[] args) {
		Map<String, String> sampleMap = new HashMap<String, String>();
		sampleMap.put("rajput", "rahul");
		sampleMap.put("middha", "shubham");
		sampleMap.put("gupta", "ayush");
		Set<Entry<String, String>> sampleSet = sampleMap.entrySet();
		List<Entry<String, String>> sampleList = new ArrayList<Entry<String, String>>(
				sampleSet);
		Collections.sort(sampleList, new Comparator<Entry<String, String>>() {

			@Override
			public int compare(Entry<String, String> o1,
					Entry<String, String> o2) {
				return o1.getValue().compareTo(o2.getValue());
			}
		});
		for (Entry<String, String> entry : sampleList) {
			System.out.println("Key: " + entry.getKey());
			System.out.println("Value: " + entry.getValue());
		}
	}

}
