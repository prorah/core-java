package com.mannindia.MapImpl;

import java.util.SortedMap;
import java.util.TreeMap;

public class BackedCollectionsImpl {

	public static void main(String[] args) {
		TreeMap<String, String> map = new TreeMap<String, String>();
		map.put("a", "ant");
		map.put("d", "dog");
		map.put("h", "horse");
		SortedMap<String, String> submap;

		// creates a copy of main map that starts from b(inclusive of b) and
		// ending before g
		submap = map.subMap("b", "g");
		System.out.println(map + "  " + submap);

		// adds to map as well as submap
		map.put("b", "bat");
		// adds to submapm and map
		submap.put("f", "fish");
		// adds only to map and not submap as r is out of range for submap
		map.put("r", "raccoon");
		System.out.println(map + "  " + submap);

	}

}
