package com.corejava.collections;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapImpl {

	public static void main(String[] args) {
		DogCollections d1 = new DogCollections("red");
		DogCollections d2 = new DogCollections("black");
		DogCollections d3 = new DogCollections("white");
		Map<DogCollections, Integer> dogMap = new LinkedHashMap<>();
		dogMap.put(d1, 5);
		dogMap.put(d2, 10);
		dogMap.put(d3, 15);

		// get values Collection from Map using values() method
		Collection<Integer> valuesCollection = dogMap.values();
		System.out.println(valuesCollection);

		// get entire Set of keys from Map
		Set<DogCollections> keySet = dogMap.keySet();
		System.out.println(keySet);
		System.out.println(dogMap.get(d1));
		System.out.println(dogMap.containsKey(d1));
		for (Entry<DogCollections, Integer> entry : dogMap.entrySet()) {
			System.out.println(entry.getValue());
		}

	}

}
