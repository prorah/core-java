package com.demo.cloneable;

public class CloneableTest {

	public static void main(String[] args) throws CloneNotSupportedException {
		Student student = new Student(1, "rahul");
		Student student1 = (Student) student.clone();
		System.out.println(student.hashCode());
		System.out.println(student1.hashCode());

	}

}
