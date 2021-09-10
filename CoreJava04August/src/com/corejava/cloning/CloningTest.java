package com.corejava.cloning;

public class CloningTest {

	public static void main(String[] args) {
		Course course = new Course("Maths");
		Student student = new Student(1, "rahul", course);
		Student student1 = null;
		try {
			student1 = (Student) student.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}

		student.getCourse().setSubject1("English");

		System.out.println(student1.getCourse().getSubject1());

	}

}
