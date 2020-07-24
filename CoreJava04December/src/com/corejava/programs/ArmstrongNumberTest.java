package com.corejava.programs;

public class ArmstrongNumberTest {
	public static void main(String[] args) {
		int number = 153;
		checkIfArmstrong(number);
	}

	public static void checkIfArmstrong(int number) {
		int actualNumber=number;
		int sum = 0;
		int numberOfDigits = String.valueOf(number).length();
		while (number !=0 ) {
			int individualDigitResult = 1;
			int digit = number % 10;

			for (int i = 0; i < numberOfDigits; i++) {

				individualDigitResult = digit * individualDigitResult;

			}
			sum = sum + individualDigitResult;
			number = number / 10;

		}
		if (sum == actualNumber) {
			System.out.println("Armstrong number");
		} else {
			System.out.println("Not Armstrong");
		}

	}
}