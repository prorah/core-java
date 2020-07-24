package com.corejava.cloning;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

import com.java.collections.Employee;

public class CollectionsComparatorTest {
	public static void main(String[] args) {
		Employee emp1 = new Employee("rahul", "sse", 26);
		Employee emp2 = new Employee("shubham", "sse", 27);
		Employee emp3 = new Employee("rajat", "se", 28);

		/*Set<Employee> s = new TreeSet<Employee>(); s.add(emp1); s.add(emp2);
		 * s.add(emp3); Iterator<Employee> itr = s.iterator(); while
		 * (itr.hasNext()) { System.out.println(itr.next()); }
		 */

		
		//TreeMap is sorted by key and not by value
		Map<Employee, String> map = new TreeMap<Employee, String>();
		map.put(emp1,"a");
		map.put(emp2,"b");
		map.put(emp3,"c");
		Set<Entry<Employee, String>> entry = map.entrySet();
		for (Entry<Employee, String> entryVar : entry) {
			System.out.println(entryVar.getKey() + "-" + entryVar.getValue());
		}

	}
}
