package com.fis.collections;

import java.util.Map;
import java.util.TreeMap;

//Sorting in TreeMap is done on the basis of key
//TreeSet and TreeMap use compareTo method to check for duplicacy
public class TreeMapImpl {

	public static void main(String[] args) {
		Employee emp1= new Employee("b", 26);
		Employee emp2 = new Employee("d", 27);
		Employee emp3 = new Employee("c", 28);
		
	  Map<Employee,Integer> treeMap=new TreeMap<>();
		  treeMap.put(emp1, 11);
		  treeMap.put(emp2, 2); 
		  treeMap.put(emp3, 3);
		  
		  treeMap.entrySet().stream().forEach(x->System.out.println(x.getKey()+"-"+x.getValue()));
		 

		/*Set<Employee> treeSet = new TreeSet<>();
		treeSet.add(emp1);
		treeSet.add(emp2);
		treeSet.add(emp3);

		treeSet.forEach(employee->System.out.println(employee));*/

	}

}
