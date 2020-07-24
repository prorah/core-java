package com.corejava.collections;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SetImpl {

	public static void main(String[] args) {
		int a = 12;
		int b = 12;
		DogCollections d = new DogCollections("black");
		DogCollections d1 = new DogCollections("black");
		System.out.println(d.hashCode());
		System.out.println(d1.hashCode());
		Set demoSet = new TreeSet();
		demoSet.add(a);
		demoSet.add(b);
		demoSet.add(d);
		demoSet.add(d1);
		Iterator itr = demoSet.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
