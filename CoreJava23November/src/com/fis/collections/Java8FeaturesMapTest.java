package com.fis.collections;

import java.util.HashMap;
import java.util.Map;

public class Java8FeaturesMapTest {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("a", 1);
		map.put("b", 2);
		map.put("c", 3);

		// The below line of code returns the value for the key "d" if present
		// in the map. If not present returns the default value 3.
		System.out.println(map.getOrDefault("d", 3));

		// Replace all values with 1
		map.replaceAll((k, v) -> 1);

		// Iterate over map using java 8
		//map.forEach((k, v) -> System.out.println("Key : " + k + " Value : " + v));

		// Put the below key-value pair in the map if not present.
		map.putIfAbsent("d", 1);

		// Iterate over map using java 8
		//map.forEach((k, v) -> System.out.println("Key : " + k + " Value : " + v));

		//alter the value for a specific key in a map. Conditional compute statements are also available computeIfPresent/computeIfAbsent.
		//The below code gives NullPointerException if key "d" is not present in the map.
		map.compute("d", (k, v) -> v + 1);
		
		// Iterate over map using java 8
		//map.forEach((k, v) -> System.out.println("Key : " + k + " Value : " + v));
		
		//in case of merge, if e is not associated with a value, then e is added to the map and result of mapping function gets associated with the e.
		map.merge("e", 2, (v1,v2)->v1+v2);
		// Iterate over map using java 8
	    map.forEach((k, v) -> System.out.println("Key : " + k + " Value : " + v));
	    
	}

}
