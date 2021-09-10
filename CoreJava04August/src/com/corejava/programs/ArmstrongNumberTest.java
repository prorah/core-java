package com.corejava.programs;

public class ArmstrongNumberTest {

	public static void main(String[] args) {
		System.out.println(test("MCMXCIV"));
	}

	public static int test(String s) {
		char[] inputArr = s.toCharArray();
		int output = 0;
		for (int i = 0; i < inputArr.length; i++) {
			if (inputArr[i] == 'I' && i != (inputArr.length) - 1 && inputArr[i + 1] == 'V') {
				output = output + 4;
				i = i + 1;
				break;
			} else if (inputArr[i] == 'I' && i != (inputArr.length) - 1 && inputArr[i + 1] == 'X') {
				output = output + 9;
				i = i + 1;
				break;
			} else if (inputArr[i] == 'X' && i != (inputArr.length) - 1 && inputArr[i + 1] == 'L') {
				output = output + 40;
				i = i + 1;
				break;
			} else if (inputArr[i] == 'X' && i != (inputArr.length) - 1 && inputArr[i + 1] == 'C') {
				output = output + 90;
				i = i + 1;
				break;
			} else if (inputArr[i] == 'C' && i != (inputArr.length) - 1 && inputArr[i + 1] == 'D') {
				output = output + 400;
				i = i + 1;
				break;
			} else if (inputArr[i] == 'C' && i != (inputArr.length) - 1 && inputArr[i + 1] == 'M') {
				output = output + 900;
				i = i + 1;
				break;
			} else if (inputArr[i] == 'I') {
				output = output + 1;
			} else if (inputArr[i] == 'V') {
				output = output + 5;
			} else if (inputArr[i] == 'X') {
				output = output + 10;
			} else if (inputArr[i] == 'L') {
				output = output + 50;
			} else if (inputArr[i] == 'C') {
				output = output + 100;
			} else if (inputArr[i] == 'D') {
				output = output + 500;
			} else if (inputArr[i] == 'M') {
				output = output + 1000;
			}
		}
		return output;
	}

}
