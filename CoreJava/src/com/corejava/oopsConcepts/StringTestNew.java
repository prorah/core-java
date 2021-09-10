package com.corejava.oopsConcepts;

public class StringTestNew {

	public static void main(String[] args) {
		String s1 = "Test"; //pool
		String s3 = new String("Test"); //heap
		// the below intern method call creates a copy of the s3 string existing
		// in heap to string pool. But Since Test already exists in the
		// pool memory a reference is returned. Therefore, s1 and s4 refer to
		// the same object.
		final String s4 = s3.intern();
		System.out.println(s1 == s4);
	}

}
