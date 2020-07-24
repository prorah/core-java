package com.corejava.programs;

public class Test {

	public static void main(String[] args) {
		//System.out.println(recur(0));
		int number=234;
		System.out.println(1/10);
	}

	public static int recur(int count) {
		if (count < 10) {
			return count + recur(++count);
		}
		return count;
	}

}
