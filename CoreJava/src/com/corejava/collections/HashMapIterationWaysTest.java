package com.corejava.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapIterationWaysTest {

	public static void main(String[] args) {
		Employee emp1 = new Employee(26);
		Employee emp2 = new Employee(27);
		Employee emp3 = new Employee(28);
		Map<Employee, String> employeeMap = new HashMap<Employee, String>();
		employeeMap.put(emp1, "rahul");
		employeeMap.put(emp2, "shubham");
		employeeMap.put(emp3, "vikas");

		// Iteration using EntrySet
		Set<Entry<Employee, String>> entrySet = employeeMap.entrySet();
		for (Entry<Employee, String> entry : entrySet) {
			System.out.println(entry.getKey() + "-" + entry.getValue());
		}

		System.out.println("<--------------------------------->");

		// Iteration using Iterator on Entry Set
		Iterator<Entry<Employee, String>> itr = entrySet.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		System.out.println("<--------------------------------->");
		// Iteration by getting values from keys
		for (Employee employee : employeeMap.keySet()) {
			System.out.println(employee + "-" + employeeMap.get(employee));
		}

	}

}
