package com.fis.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;

//The below class demonstrates parallel stream in action. Parallel Stream lets you break the work amongst multiple cores
//of a cpu
//Sequential streams can guarantee they’re working in the same order every time. 
//But a parallel stream, by definition, is going to do things in the most efficient way possible.
public class ParallelStreamTest {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < 100; i++) {
			list.add(i);
		}
		Predicate<Integer> pred = s -> s > 50;
		list.parallelStream().filter(pred).forEach(x -> System.out.println(x));
	}

}
