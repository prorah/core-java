package com.mannindia.demo;

import java.util.Arrays;

public class SeparateBinary {

	public static void main(String[] args) {
		int[] a = { 0, 1, 0, 1, 0, 0, 1, 1, 1, 0 };
		int counter = 0;
		for (int i = 0; i < (a.length); i++) {
			if (a[i] == 0) {
				if (i != 0 && a[i - 1] == 1) {
					counter = i;
				}
			} else {
				a[counter] = 1;
				if (counter != i) {
					a[i] = 0;
				}
			}
			System.out.println(Arrays.toString(a));
		}
	}

}
