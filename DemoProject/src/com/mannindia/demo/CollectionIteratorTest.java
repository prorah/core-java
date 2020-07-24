package com.mannindia.demo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class CollectionIteratorTest {

	public static void main(String[] args) {
		List<String> sampleList = new ArrayList<String>();
		Map<String,Integer> sampleMap=new HashMap<String,Integer>();
		sampleList.add("rahul");
		Iterator<String> itr = sampleList.iterator();
		while (itr.hasNext()) {
			System.out.println("Value: " + itr.next());
		}

	}
}
