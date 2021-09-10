package com.demo.functionalInterface;

@FunctionalInterface
public interface TestFunctionalInterface {

	//Has to be overriden by implementing class
	public void abstractMethod();

	//Default Method: may or may not be overriden by implementing class
	public default void defaultMethod() {
		System.out.println("Default Method from Interface");
	}

	//Static Method: Cannot be overriden by implementing class
	public static void staticMethod() {
		System.out.println("Static Method");
	}

}
