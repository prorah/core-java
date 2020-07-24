package com.corejava.oopsConcepts;

//From Java 6 onwards it is mandatory to have a main method in java otherwise at compile time we get main method not found error

//Final instance variables of class type cannot be changed to refer to a different object

//The final keyword can be interpreted in two different ways depending on what it's used on:

//Value types: For ints, doubles etc, it will ensure that the value cannot change,

//Reference types: For references to objects, final ensures that the reference will never change, meaning that it will always refer to the same object. It makes no guarantees whatsoever about the values inside the object being referred to staying the same.
public class FinalVariableTest extends FinalInstanceVariableTest {

	private static final FinalVariableTest finalVariableTest = new FinalVariableTest();

	public static void main(String[] args){
	//finalVariableTest=new FinalVariableTest();
	}

}
