package com.mannindia.Cloning;

public class CopyConstructorCloningTest {

	public static void main(String[] args) {
		PointOneCloning pointA = new PointOneCloning(1, 2);
		PointTwoCloning pointB = new PointTwoCloning(1, 2, 3);

		PointOneCloning cloneA = new PointOneCloning(pointA);
		PointOneCloning cloneB = new PointOneCloning(pointB);

		System.out.println(cloneA.getClass());
		System.out.println(cloneB.getClass());
	}

}
