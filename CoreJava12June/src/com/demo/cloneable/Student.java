package com.demo.cloneable;

public class Student implements Cloneable {

	private final int id;
	private final String name;

	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	protected Object clone() throws CloneNotSupportedException{
		return super.clone();
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

}
