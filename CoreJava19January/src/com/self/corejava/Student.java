package com.self.corejava;

public class Student implements Cloneable {

	private String name;
	private int age;
	private Course course;

	public Student(String name, int age, Course course) {
		super();
		this.name = name;
		this.age = age;
		this.course = course;
	}

	//Method overriden for deep cloning
	@Override
	protected Object clone() throws CloneNotSupportedException {
		Student student = (Student) super.clone();
		student.setCourse((Course) course.clone());
		return student;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", course=" + course + "]";
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

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

}
