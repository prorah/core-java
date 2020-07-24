package com.java.immutableClass;

//for immutable class we need to do the following:
//mark the class as final
//mark member variables as final
//do not expose setter methods
//modify constructor in case there are mutable fields in immutable class

//Immutable classes provide advantage when used in a multithreaded environment. The only disadvantage is that they use more memory than the traditional class as everytime a new object is created.
public final class Employee {
	private final String name;
	// below is a mutable field
	private final Age age;

	public Employee(String name, Age age) {
		this.name = name;
		Age clonedAge = new Age();
		clonedAge.setYear(age.getYear());
		this.age = clonedAge;
	}

	public String getName() {
		return name;
	}

	public Age getAge() {
		return age;
	}

}
