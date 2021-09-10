package com.corejava.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

//add method in list iterator adds an element at the itr position
public class ArrayListImpl {

	public static void main(String[] args) {
		List<String> demoList = new ArrayList<String>();
		demoList.add("rahul");//returns boolean
		demoList.add("shubham");
		demoList.add("jagga");
		// Iteration using List Iterator

		ListIterator<String> itr = demoList.listIterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());

		}
		System.out.println("In reverse order");
		while (itr.hasPrevious()) {
			System.out.println(itr.previous());
			// itr.set("rajput");

		}

		// Set method replaces the last element returned by next()/previous()
		// with the element specified in set call.
		 itr.set("rajput");

		for (String s : demoList) {
			System.out.println(s);
		}
	}

}
