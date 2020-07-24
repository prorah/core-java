package com.corejava.cloning;

public class StudentCloning implements Cloneable {
	private String name;
	private int age;
	private CourseCloning course;

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

	public CourseCloning getCourse() {
		return course;
	}

	public void setCourse(CourseCloning course) {
		this.course = course;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	@Override
	public String toString() {
		return "StudentCloning [name=" + name + ", age=" + age + ", course=" + course + "]";
	}

}
