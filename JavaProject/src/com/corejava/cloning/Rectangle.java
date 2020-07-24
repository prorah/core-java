package com.corejava.cloning;

public class Rectangle {
	private int length;
	private int breadth;

	// Normal constructor
	public Rectangle(int length, int breadth) {
		this.length = length;
		this.breadth = breadth;
	}

	// copy constructor
	public Rectangle(Rectangle rect) {
		length = rect.getLength();
		breadth = rect.getBreadth();
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getBreadth() {
		return breadth;
	}

	public void setBreadth(int breadth) {
		this.breadth = breadth;
	}

}
