package com.mannindia.Cloning;

public class PointTwoCloning extends PointOneCloning {

	public int z;

	public PointTwoCloning(PointTwoCloning point) {
		super(point);
		this.z = point.z;
	}

	public PointTwoCloning(int x, int y, int z) {
		super(x, y);
		this.x = x;
		this.y = y;
		this.z = z;
	}

}
