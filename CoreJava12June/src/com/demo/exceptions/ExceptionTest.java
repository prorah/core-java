package com.demo.exceptions;

public class ExceptionTest {

	public static void main(String[] args) {
		System.out.println(method1());

	}

	static int method1() {
		try {
			throw new Exception();
		} catch (Exception e) {
			return 3;
		} finally {
			return 2;
		}

	}

}
