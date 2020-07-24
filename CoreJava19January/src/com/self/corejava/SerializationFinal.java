package com.self.corejava;

import java.io.Serializable;

public class SerializationFinal extends SerializationFinalParent implements Serializable  {

	private String name;
	private final transient int age;
	
	
	

	public SerializationFinal(String name) {
		super(24);
		System.out.println("constructor called");
		this.age=24;
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "SerializationFinal [name=" + name + "]" + age;
	}

}
