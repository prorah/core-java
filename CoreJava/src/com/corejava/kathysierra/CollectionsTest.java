package com.corejava.kathysierra;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

//TreeMap uses compareTo method to define if keys are equal or not
//Iterator can be used only for List and Set
public class CollectionsTest {

	public static void main(String[] args) {

		CollectionsEmp emp1 = new CollectionsEmp("a", 26);
		CollectionsEmp emp2 = new CollectionsEmp("a", 27);
		CollectionsEmp emp3 = new CollectionsEmp("abc", 26);
		
		
		/*Map<CollectionsEmp, Integer> map = new HashMap<>();
		map.put(emp1, 13);
		map.put(emp2, 14);
		Set<Entry<CollectionsEmp,Integer>> entrySet=map.entrySet();
	    for(Entry<CollectionsEmp,Integer> entry:entrySet){
		System.out.println(entry.getKey()+","+entry.getValue());
	    }*/
		
		//By default pointer for list is at the starting and therefore itr.previous() will not work.
		//Searching and Sorting both require that objects of CollectionsEmp must be comparable to each other.
		/*List<CollectionsEmp> list = new LinkedList<>();
		list.add(emp1);
		list.add(emp2);
		list.add(emp3);
		Collections.sort(list);
		System.out.println(Collections.binarySearch(list, emp2));
		ListIterator<CollectionsEmp> itr = list.listIterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}*/
	    
	    Set<CollectionsEmp> set=new TreeSet<>();
	    set.add(emp1);
	    set.add(emp2);
	    set.add(emp3);
	    Iterator<CollectionsEmp> itr=set.iterator();
	    while(itr.hasNext()){
	    	System.out.println(itr.next());
	    }
	}

}
