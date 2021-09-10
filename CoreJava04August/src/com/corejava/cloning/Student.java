package com.corejava.cloning;

public class Student implements Cloneable {

	private int studentId;
	private String name;
	private Course course;

	public Student(int studentId, String name, Course course) {
		super();
		this.studentId = studentId;
		this.name = name;
		this.course = course;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		Student student = (Student) super.clone();

		student.course = (Course) course.clone();

		return student;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

}
