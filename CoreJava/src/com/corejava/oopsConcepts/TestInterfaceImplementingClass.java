package com.corejava.oopsConcepts;

import java.io.FileNotFoundException;

//This class demonstrates exception handling wrt to interfaces and implementing classes.
public class TestInterfaceImplementingClass implements TestInterface {

	// Both IOException and FileNotFoundException are examples of checked
	// Exceptions as they get checked at compile time. The implementing
	// method cannot declare a broader checked exception. However, an unchecked
	// exception can be thrown by the implementing method such as
	// IndexOutOfBoundException
	@Override
	public void run() throws FileNotFoundException {

		System.out.println("run method called");
	}

}
