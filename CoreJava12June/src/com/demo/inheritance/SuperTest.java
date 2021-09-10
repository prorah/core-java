package com.demo.inheritance;

//Demonstrates static method in parent and child class which is not method overriding
public class SuperTest {

	public static void main(String[] args) {
		ParentClass p = new ChildClass();
		System.out.println(p.x);

	}

}

class ParentClass {
	final int x = 500;

	static void display() {
		System.out.println("parent class display method");
	}
}

class ChildClass extends ParentClass {
	int x = 1000;

	static void display() {
		System.out.println("child class display method");
	}

}