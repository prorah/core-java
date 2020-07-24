package com.mannindia.demo;

public class CodingToInterfacesClass implements CodingToInterfaces {

	@Override
	public void run() {
		System.out.println("run of class called");

	}

	@Override
	public void go() {
		System.out.println("go of class called");
	}
	
	public void set(){
		System.out.println("set of class called");
	}

}
