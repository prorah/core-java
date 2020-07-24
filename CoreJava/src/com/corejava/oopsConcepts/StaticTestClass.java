package com.corejava.oopsConcepts;

public class StaticTestClass {
	private String name;
	private static int age;

	public StaticTestClass() {
		age = age + 1;
		System.out.println(this.age);
	}

	public static void main(String[] args) {
		StaticTestClass staticTestClass = new StaticTestClass();
		StaticTestClass staticTestClass2 = new StaticTestClass();
		StaticTestClass staticTestClass3 = new StaticTestClass();
		// Normal Instance variables are initialized each time constructor is
		// invoked.
		// Static instance variables are initialized only when class is loaded
		// for the first time.
	}
}
