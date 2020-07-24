package com.fis.oopsConcept;

public class ExtendFinalClass extends SampleFinalClass {

	public static void main(String[] args) throws CustomException {
		ExtendFinalClass s = new ExtendFinalClass();
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
			if (i == 5) {
				throw new CustomException("exception because i==5");
			}
		}

	}

	public void displayClassName() {
		System.out.println("ExtendFinalClass");
	}

	public ExtendFinalClass() {
		super(12, "s");
		System.out.println("no arg cons of Extend Final class called");
	}

}
