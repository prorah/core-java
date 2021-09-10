package com.demo.java8Streams;

import java.util.Arrays;

public class StringStream {

	public static void main(String[] args) {
		String[] str = new String[] { "rahul", "rajat", "shubham" };
		Arrays.stream(str).filter(s -> s.startsWith("r")).forEach(s -> System.out.println(s));
	}

}
