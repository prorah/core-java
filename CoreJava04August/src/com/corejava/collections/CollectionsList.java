package com.corejava.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

public class CollectionsList {

	public static void main(String[] args) {
		List<Employee> employeeList = new ArrayList<Employee>();
		Employee emp1 = new Employee(1, "aa");
		Employee emp2 = new Employee(2, "b");
		Employee emp3 = new Employee(3, "ccc");

		employeeList.add(emp1);
		employeeList.add(emp2);
		employeeList.add(emp3);
		EmployeeComparator comp=new EmployeeComparator();
		//Collections.sort(employeeList,comp);
		
		Predicate<Employee> pred=p->p.getId()>=2;

		employeeList.stream().filter(pred).forEach(emp->{
			System.out.println(emp.getName());
			System.out.println(emp.getId());
		});
		
		//System.out.println(Collections.binarySearch(employeeList,emp2,comp));

	}

}
