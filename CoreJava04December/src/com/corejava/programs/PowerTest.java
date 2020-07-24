package com.corejava.programs;

import java.util.Scanner;

public class PowerTest {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 4; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			System.out.println(calculatePower(a, b));
		}
	}

	static int calculatePower(int a, int b) throws Exception {
		if (a >= 0 && b >= 0) {
			return (int) Math.pow(a, b);
		} else {
			throw new Exception("Either a or b is negative");
		}
	}

}
