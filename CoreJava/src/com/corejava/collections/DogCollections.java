package com.corejava.collections;

public class DogCollections {
	private String color;

	public DogCollections(String color) {
		super();
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public boolean equals(Object obj) {
		return this.color.length() == (((DogCollections) obj).getColor().length());
	}
	
	@Override
	public int hashCode() {
		return color.length();
	}

	@Override
	public String toString() {
		return this.color;
	}

	
}
