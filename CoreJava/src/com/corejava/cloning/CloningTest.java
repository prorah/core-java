package com.corejava.cloning;

//This class demonstrates Shallow Copy in Java
public class CloningTest {

	public static void main(String[] args) throws CloneNotSupportedException {
		StudentCloning student = new StudentCloning();
		CourseCloning course = new CourseCloning();
		course.setSubject1("english");
		course.setSubject2("maths");
		student.setAge(20);
		student.setName("rahul");
		student.setCourse(course);

		StudentCloning studentClone = (StudentCloning) student.clone();
		System.out.println("Student cloned: " + studentClone);
		// Change in original object property is not reflected in the copy
		student.setAge(30);
		System.out.println(studentClone.getAge());
		// Change in the original object property is reflected in the copy
		student.getCourse().setSubject1("hindi");
		System.out.println(studentClone.getCourse().getSubject1());
	}

}
