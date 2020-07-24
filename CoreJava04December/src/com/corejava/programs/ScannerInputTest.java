package com.corejava.programs;

import java.util.Arrays;
import java.util.Scanner;

public class ScannerInputTest {

	public static void main(String[] args) {
		System.out.println("Enter the number: ");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String[] inputStr = str.split(" ");
		System.out.println(Arrays.toString(inputStr));
		sc.close();
	}

}
