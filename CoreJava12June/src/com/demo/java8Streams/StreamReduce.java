package com.demo.java8Streams;

import java.util.Arrays;
import java.util.Optional;

//Demonstrates the usage of reduce in streams
public class StreamReduce {

	public static void main(String[] args) {
		String[] input = { "Rahul", "Rajput", "Engineer" };

		Optional<String> string_output = Arrays.asList(input).stream().reduce((a1, a2) -> a1 + "-" + a2);
		if (string_output.isPresent()) {
			System.out.println(string_output.get());
		}

	}

}
