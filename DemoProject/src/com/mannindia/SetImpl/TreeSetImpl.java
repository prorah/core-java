package com.mannindia.SetImpl;

import java.util.Set;
import java.util.TreeSet;

//The NavigableSet methods are demonstrated in this class. The parallel NavigableMap methods are lowerKey() , floorKey() , ceilingKey() , and
//higherKey()

//The parallel map methods for Set methods are pollFirstEntry(), pollLastEntry() and descendingMap()
public class TreeSetImpl {

	public static void main(String[] args) {
		TreeSet<Integer> times = new TreeSet<Integer>();
		times.add(1205);
		times.add(1505);
		times.add(1545);
		times.add(1600);
		times.add(1830);
		times.add(2010);
		times.add(2100);

		Set<Integer> subHeadSet = new TreeSet<Integer>();
		Set<Integer> subTailSet = new TreeSet<Integer>();
		// Less than 1600
		subHeadSet = times.headSet(1600);

		// greater than and equal to 1600
		subTailSet = times.tailSet(1600);
		System.out.println("Element just greater than 1600 is: "
				+ times.higher(1600));
		System.out.println("Element just less than 1600 is: "
				+ times.lower(1600));
		System.out.println("Element less than 1600 or equal to 1600 is: "
				+ times.floor(1600));
		System.out.println("Element greater than 1600 or equal to 1600 is: "
				+ times.ceiling(1600));

		System.out.println("Return and Remove the first element in the set: "
				+ times.pollFirst());

		System.out.println("Return and Remove the last element in the set: "
				+ times.pollLast());

		for (Integer i : subHeadSet) {
			System.out.println("subHeadSet: " + i);
		}
		for (Integer j : subTailSet) {
			System.out.println("subTailSet: " + j);
		}
		for (Integer k : times) {
			System.out.println("Times: " + k);
		}

		// reverse the set using the
		for (Integer l : times.descendingSet()) {
			System.out.println("Descending times set: " + l);
		}
	}

}
