package com.corejava.nestedClass;

public class MethodLocalInnerClass {
	private int x = 7;

	public void outerMethod() {
		System.out.println("method of outer class called");
		int y = 8;
		class MyInnerMethodLocal {
			public void innerMethod() {
				System.out.println("method of inner class called, value of outer class var is:" + y);// allowed
																										// to
																										// use
																										// local
																										// variable
																										// y
																										// as
																										// it
																										// is
																										// considered
																										// effectively
																										// final
																										// in
																										// java
																										// 8
			}
		}
		// Method Local Inner class can only be instantiated from within the
		// method where the method local inner class is defined.
		MyInnerMethodLocal methodLocal = new MyInnerMethodLocal();
		methodLocal.innerMethod();
	}
}
