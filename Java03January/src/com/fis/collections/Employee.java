package com.fis.collections;

public class Employee implements Comparable<Employee> {
	private String name;

	public Employee(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + "]";
	}

	/*@Override
	public boolean equals(Object o) {
		return this.name.length() == ((Employee) o).name.length();
	}

	@Override
	public int hashCode() {
		return this.name.length();
	}*/

	@Override
	public int compareTo(Employee arg0) {
		if (this.name.length() > arg0.name.length()) {
			return 1;
		} else if (this.name.length() < arg0.name.length()) {
			return -1;
		}
		return 0;
	}

}
