package com.corejava.nestedClass;

public class MyOuterClass {
	private int x = 7;

	public void outerMethod() {
		System.out.println("method of outer class called");
	}

	public class MyInner {
		public void innerMethod() {
			System.out.println("method of inner class called, value of outer class var is:" + x);
		}
	}

}
