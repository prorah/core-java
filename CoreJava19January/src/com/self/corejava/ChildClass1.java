package com.self.corejava;

public class ChildClass1 extends ParentClass {
	int a = 25;
	String b = "child1";

	public void method() {
		methodParent();

	}

	public void methodParent() {
		System.out.println("child1 method called");
	}

}
