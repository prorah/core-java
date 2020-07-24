package com.corejava.oopsConcepts;

public class CopyConstructorTest {

	public static void main(String[] args) {
		// Object created using normal constructor
		EmployeeCopyConstructor employee = new EmployeeCopyConstructor("rahul", 23);

		// Object created using copy constructor
		EmployeeCopyConstructor employeeNew = new EmployeeCopyConstructor(employee);
		System.out.println(employee.equals(employeeNew));
	}

}
