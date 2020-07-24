package com.corejava.cloning;

public class CopyConstructorTest {

	public static void main(String[] args) {
		Rectangle rect = new Rectangle(5, 10);
		Rectangle rect1 = new Rectangle(rect);
		System.out.println(rect.hashCode());
		System.out.println(rect1.hashCode());
		rect.setLength(6);
		System.out.println(rect1.getLength());

	}

}
