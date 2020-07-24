package com.mannindia.demo;

public class StringHeap {

	public static void main(String[] args) {
		String s1 = "abc";
		s1 = s1.concat("def");
		System.out.println(s1);
		// The below string reference variable will also refer to the already
		// created object.
		String s2 = "abc";
		System.out.println(s1 == s2);// Both refer to the same object
		// Above are created in string pool
		System.out.println(s1.equals(s2));
		String s3 = new String("abc"); // created in heap memory

		System.out.println(s1.equals(s3));// Content is same
		System.out.println(s1 == s3);// Different objects

	}

}
