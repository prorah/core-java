package com.corejava.collections;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetImpl {

	public static void main(String[] args) {
		Set<EmployeeCollections> employeeSet = new TreeSet<>();
		EmployeeCollections emp1 = new EmployeeCollections("rahul", 26);
		EmployeeCollections emp2 = new EmployeeCollections("rahul", 26);
		employeeSet.add(emp1);
		employeeSet.add(emp2);
		Iterator<EmployeeCollections> itr = employeeSet.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
