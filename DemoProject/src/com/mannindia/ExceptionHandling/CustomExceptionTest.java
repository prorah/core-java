package com.mannindia.ExceptionHandling;

import java.io.FileNotFoundException;

public class CustomExceptionTest {
	public static void main(String[] args) {
		try {
			UtilityArrayAdd.returnLines();
		} catch (FileNotFoundException e) {

		}
	}

}
