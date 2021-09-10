package com.corejava.collections;

public class Employee{

	private int id;
	private String name;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}

	/*@Override
	public int compareTo(Employee o) {
		if (this.name.length() > (o.getName().length())) {
			return 1;
		} else if (this.name.length() < (o.getName().length())) {
			return -1;
		} else {
			return 0;
		}
	}*/

	/*@Override
	public int hashCode() {
		return this.name.length();
	}

	@Override
	public boolean equals(Object obj) {
		if(this.name.length()==((Employee)obj).name.length()){
			return true;
		}
		return false;
	}*/
	
	

}
