package com.corejava.kathysierra;

public class CollectionsEmp implements Comparable<CollectionsEmp> {
	@Override
	public String toString() {
		return this.name;
	}

	private String name;
	private int age;

	public CollectionsEmp(String name, int age) {
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

	public int compareTo(CollectionsEmp arg0) {
		return this.name.compareTo(arg0.name);
	}

	@Override
	public boolean equals(Object o) {
		return this.name.length() == ((CollectionsEmp) o).name.length();
	}
	
	@Override
	public int hashCode(){
		return this.name.length();
	}

}
