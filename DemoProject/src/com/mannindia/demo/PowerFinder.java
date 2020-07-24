package com.mannindia.demo;

public class PowerFinder {

	public static void main(String[] args) {
		boolean result = power(8, 2);
		System.out.println(result);
	}

	public static boolean power(int x, int y) {
		boolean output = false;
		if (x % y == 0) {
			int mult = y;
			for (int i = 0; i <= x / y; i++) {
				mult = mult * y;
				if (mult == x) {
					output = true;
					break;
				}
			}
		}
		return output;
	}

}
