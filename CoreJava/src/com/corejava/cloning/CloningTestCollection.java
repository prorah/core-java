package com.corejava.cloning;

import java.util.HashMap;
import java.util.Map;

//This class demonstrates shallow copy in the case of a map
public class CloningTestCollection {
	public static void main(String[] args) throws CloneNotSupportedException {
		StudentCloningCollection student = new StudentCloningCollection();
		student.setName("rahul");
		student.setAge(23);
		Map<String, String> addressMap = new HashMap<String, String>();
		addressMap.put("city", "jodhpur");
		addressMap.put("title", "developer");
		student.setAddressMap(addressMap);
		System.out.println("Student: " + student);
		StudentCloningCollection studentCloned = (StudentCloningCollection) student.clone();
		addressMap.put("city", "delhi");
		System.out.println("Student Cloned: " + studentCloned);
		System.out.println("Student: " + student);

	}

}
