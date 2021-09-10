package com.corejava.collections;

public class EmployeeList implements Comparable<EmployeeList> {
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

	public EmployeeList(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}

	@Override
	public int compareTo(EmployeeList o) {
		if (this.name.length() > (o.getName().length())) {
			return 1;
		} else if (this.name.length() < (o.getName().length())) {
			return -1;
		} else {
			return 0;
		}
	}

}
