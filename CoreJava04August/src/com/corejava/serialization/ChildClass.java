package com.corejava.serialization;

import java.io.Serializable;

public class ChildClass extends ParentClass implements Serializable {

	int c1;

	{
		System.out.println("child instance block called");
	}

	@Override
	public String toString() {
		return "ChildClass [c1=" + c1 + "]";
	}

}
