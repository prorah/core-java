package com.corejava.newoops;

public class ConstructorTest {

	public static void main(String[] args) {
		Employee emp = (Employee) new Human("a",26);
		Human human = emp;
		System.out.println(human);
	}
}
