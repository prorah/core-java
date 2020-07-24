package com.corejava.oops;

//Demonstrates that java is pass by value
public class PassByValueTest {

	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.setAge(25);
		emp.setName("A");
		testMethod(emp);
		System.out.println("After method call Employee object: " + emp);

	}

	public static void testMethod(Employee o) {
		o.setAge(26);
		System.out.println("Within method Employee object: " + o);
	}

}
