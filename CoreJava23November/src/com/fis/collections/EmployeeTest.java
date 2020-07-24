package com.fis.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class EmployeeTest {

	public static void main(String[] args) {
		Employee emp1 = new Employee("abc", 27);
		Employee emp2 = new Employee("xyz", 27);
		 System.out.println(emp1.equals(emp2));
		System.out.println(emp1 == emp2);
		List<Employee> empList = new ArrayList<>();
		empList.add(emp1);
		empList.add(emp2);
		System.out.println(empList.size());
		ListIterator<Employee> iterator = empList.listIterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		while(iterator.hasPrevious()){
			System.out.println(iterator.previous());
		}

	}

}
