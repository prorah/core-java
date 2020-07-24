package com.self.corejava;

public class TestClass {

	public static void main(String[] args) {
		ParentClass p = new ChildClass1();
		System.out.println(((ChildClass2) p).b); // ClassCastException:
													// ChildClass1 cannot be
													// cast to ChildClass2

		System.out.println(((ChildClass1) p).b); // ChildClass1 variable called.

		System.out.println(p.b); // parent class variable called.

	}

}
