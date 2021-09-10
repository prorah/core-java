package com.corejava.programs;

import java.util.Scanner;

public class ScannerInputTest {

	public static void main(String[] args) {
		System.out.println("Enter the input 1: ");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println("Input 1 is:" + str);
		String str2 = sc.nextLine();
		System.out.println("Input 2 is:" + str2);
		sc.close();

	}

}
