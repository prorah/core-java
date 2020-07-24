package com.corejava.oopsConcepts;

public class AnimalDogTest {
	public static void main(String[] args) {

		Animal animal = new Animal();

		// Downcasting works at compile time but at runtime it gives
		// ClassCastException
		// We need to add an explicit cast in the case of Downcasting.

		Dog d = (Dog) animal; // Downcasting

		// UpCasting works implicitly. No cast is actually required.

	}
}
