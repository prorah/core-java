package com.corejava.programs;

public class ApowerBTest {

	public static void main(String[] args) {
		System.out.println(testPower(5, 125));
	}

	public static String testPower(int a, int b) {
		int remainder;
		int counter = 0;
		while (b >= a) {
			remainder = b % a;
			if (remainder != 0) {
				return "not a power";
			}
			b = b / a;
			counter++;
		}
		return "is a power: " + counter;

	}

}
