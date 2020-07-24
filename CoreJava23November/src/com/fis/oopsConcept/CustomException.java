package com.fis.oopsConcept;

public class CustomException extends Exception {

	public CustomException(String message) {
		super(message);
		System.out.println("Custom exception invoked");
	}

}
