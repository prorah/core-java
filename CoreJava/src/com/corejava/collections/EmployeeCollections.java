package com.corejava.collections;

public class EmployeeCollections implements Comparable<EmployeeCollections> {
	private String name;
	private int age;

	public EmployeeCollections(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	//compare to method on the basis of age
	/*@Override
	public int compareTo(EmployeeCollections o) {
		if (this.age == o.getAge()) {
			return 0;
		} else if (this.age > o.getAge()) {
			return 1;
		} else
			return -1;
	}*/
	
	

	@Override
	public String toString() {
		return "EmployeeCollections [name=" + name + ", age=" + age + "]";
	}

	
	@Override
	public int compareTo(EmployeeCollections o) {
		return this.name.compareTo(o.getName());
	}

}
