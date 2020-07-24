package com.corejava.overridingTest;

import java.util.Date;

public class OverridingTest {

	public static void main(String[] args) {
		Employee emp = new Developer();
		emp.displayClassName();
		// Developer dev=(Developer) new Employee();
		System.out.println(new Date(System.currentTimeMillis()));
		System.out.println(new Date(System.nanoTime()));
		
		
	}

}
