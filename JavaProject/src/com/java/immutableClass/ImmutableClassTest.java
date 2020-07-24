package com.java.immutableClass;

public class ImmutableClassTest {

	public static void main(String[] args) {
		Age age = new Age();
		age.setYear(1992);
		Employee employee = new Employee("rahul", age);
		System.out.println(employee.getAge().getYear());
		age.setYear(1993);
		System.out.println(employee.getAge().getYear());
	}

}
