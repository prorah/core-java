package com.self.corejava;

public class CloneableTest {

	public static void main(String[] args) throws CloneNotSupportedException {
		Course course = new Course("courseA");
		Student student = new Student("studentA", 26, course);

		Student clonedStudent = (Student) student.clone();
		course.setCourseName("courseB");

		student.setCourse(course);
		System.out.println(student);
		System.out.println(clonedStudent);

	}

}
