package com.corejava.oopsConcepts;

public class PrimitiveTest {
	public static void main(String[] args) {

		// Byte can hold only upto 127 and therefore we need an explicit cast
		byte a = (byte) 128;
		System.out.println("Value of var a is: " + a);

		// Decimals are Double by default and therefore we need to use f or F
		// for a float variable.
		float b = 32.3f;

		// Below is ok as the compiler puts an implicit cast. Small primitives
		// can fit in bigger container
		int c = a;

		// Float value cannot be put into a int container. Therefore, explicit
		// cast is required.
		int d = (int) b;
		System.out.println("The value of var d is: " + d);
	}

}
