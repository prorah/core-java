package com.corejava.collections;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetImpl {

	public static void main(String[] args) {
		Set<EmployeeCollections> employeeSet = new TreeSet<>();
		EmployeeCollections emp1 = new EmployeeCollections("rahul",30);
		EmployeeCollections emp2 = new EmployeeCollections("rajat", 26);
		EmployeeCollections emp3=new EmployeeCollections("shubham", 21);
		employeeSet.add(emp1);
		employeeSet.add(emp2);
		employeeSet.add(emp3);
		Iterator<EmployeeCollections> itr = employeeSet.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
