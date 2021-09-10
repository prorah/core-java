package com.corejava.serialization;

public class ParentClass{

	int p1;
	
	public ParentClass(){
		System.out.println("no-arg constructor");
		p1=13;
	}

	{
		System.out.println("parent instance block called");
		p1=12;
	}

	@Override
	public String toString() {
		return "ParentClass [p1=" + p1 + "]";
	}

}
