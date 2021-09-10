package com.demo.collections;

public class EmployeeEquals {

	private int id;
	private String name;

	public EmployeeEquals(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public boolean equals(Object o) {
		return true;
	}

	@Override
	public String toString() {
		return "EmployeeEquals [id=" + id + ", name=" + name + "]";
	}
	
	public int hashCode(){
		return 1;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

}
