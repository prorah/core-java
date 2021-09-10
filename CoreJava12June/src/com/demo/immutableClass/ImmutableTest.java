package com.demo.immutableClass;

public class ImmutableTest {

	public static void main(String[] args) {
		Age age=new Age();
		age.setDay(1);
		age.setMonth(3);
		age.setYear(2013);
		Student student=new Student(2, "rahul", age);
		System.out.println(student.getAge().getYear());
		student.getAge().setYear(2014);
		System.out.println(student.getAge().getYear());

	}

}
