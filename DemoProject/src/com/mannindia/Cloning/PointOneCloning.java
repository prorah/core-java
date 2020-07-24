package com.mannindia.Cloning;

public class PointOneCloning {
	public int x;
	public int y;

	// Copy Constructor
	public PointOneCloning(PointOneCloning point) {
		this.x = point.x;
		this.y = point.y;

	}

	public PointOneCloning(int x, int y) {
		this.x = x;
		this.y = y;
	}
}
