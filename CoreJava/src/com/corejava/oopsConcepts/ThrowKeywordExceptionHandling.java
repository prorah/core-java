package com.corejava.oopsConcepts;

public class ThrowKeywordExceptionHandling {

	public static void testMethod() throws Exception{
		for (int i = 0; i <= 10; i++) {
			System.out.println("The value of i is: " + i);
			if (i == 5)
				throw new Exception();
		}
	}

	public static void main(String[] args) {
		try {
			testMethod();
		} catch (Exception e) {
			System.out.println("In catch Block");
			e.printStackTrace();
		}
	}

}
