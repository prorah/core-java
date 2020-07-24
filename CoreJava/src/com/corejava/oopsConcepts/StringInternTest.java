package com.corejava.oopsConcepts;

public class StringInternTest {

	public static void main(String[] args) {
		String s1 = "HelloWorld";//created in pool
		String s3 = new String("HelloWorld"); //created in heap
		String s2 = s1.intern();
		System.out.println(s1 == s2);
		

	}

}
