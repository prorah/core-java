package com.self.corejava;

public class Course implements Cloneable {
	private String courseName;

	public Course(String courseName) {
		super();
		this.courseName = courseName;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	@Override
	public String toString() {
		return this.courseName;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

}
