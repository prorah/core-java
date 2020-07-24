package com.corejava.oopsConcepts;

public class PassByValueTest {

	public static void main(String[] args) {
		Balloon red = new Balloon("red");
		Balloon blue = new Balloon("blue");
		System.out.println(red.hashCode());
		swap(red, blue);
		System.out.println("Red Object: " + red.getColor());
		System.out.println("Blue Object: " + blue.getColor());

		foo(blue);
		System.out.println("Blue Object: " + blue.getColor());

	}

	public static void foo(Balloon o) {
		// call to setter works on the object and therefore the state of object
		// gets changed
		o.setColor("red");
	}

	// Java is pass by value and therefore object state remains intact
	public static void swap(Balloon o1, Balloon o2) {
		System.out.println(o1.hashCode());
		Balloon temp = o1;
		System.out.println(temp.hashCode());
		o1 = o2;
		o2 = temp;
	}

}
