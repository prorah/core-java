package com.java.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.corejava.cloning.Human;

public class CollectionsEquals {

	public static void main(String[] args) {
		// equals with String list
		List<String> list1 = new ArrayList<>();
		list1.add("rahul");
		list1.add("rajput");
		List<String> list2 = new ArrayList<>();
		list2.add("rahul");
		list2.add("rajput");
		//System.out.println(list1.equals(list2));
		//System.out.println(list1 == list2);

		// equals with String
		Map<String, Integer> map1 = new HashMap<String, Integer>();
		Map<String, Integer> map2 = new HashMap<String, Integer>();
		map1.put("rahul", 1);
		map1.put("rajput", 2);
		map2.put("rahul", 1);
		map2.put("rajput", 3);
		//System.out.println(map1.equals(map2));

		// equals with Object type list
		List<Human> list3 = new ArrayList<>();
		Human human = new Human("male");
		Human human1 = new Human("male");
		list3.add(human);
		List<Human> list4 = new ArrayList<>();
		list4.add(human1);
		//System.out.println(list3.equals(list4));

		// equals with Object type hashmap
		// If Object type is key in map, then we need to override both hashcode
		// and equals method.
		// If Object type is value in map, we need to override only equals
		// method
		Map<Integer, Human> map3 = new HashMap<Integer, Human>();
		Map<Integer, Human> map4 = new HashMap<Integer, Human>();
		map3.put(26, human);
		map4.put(26, human1);
		//System.out.println("map3 vs map4: "+map3.equals(map4));

		// Equals method on set with Object type
		// We need to override hashcode and equals for eqaulity between sets
		Set<Human> set = new HashSet<Human>();
		Set<Human> set1 = new HashSet<Human>();
		set.add(human);
		set1.add(human1);
		System.out.println(set.equals(set1));
	}

}
