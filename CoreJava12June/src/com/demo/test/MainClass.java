package com.demo.test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class MainClass {

	public static void main(String[] args) {
	List<String> listA=Arrays.asList("1","2","3");
	List<String> listB=Arrays.asList("3","2","1","4");
	System.out.println(new HashSet<>(listA).equals(new HashSet<>(listB)));

	}

}

class ParentClass implements InterfaceB {

	int a=3;
	
	ParentClass() {
		System.out.println("parent constructor called");
	}

	void parentMethod() {
		System.out.println("parent method called");
	}

	@Override
	public void methodA() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void methodB() {
		// TODO Auto-generated method stub
		
	}

}

class ChildClass extends ParentClass {

	 void parentMethod() {
		System.out.println(a);
	}

	ChildClass() {
		System.out.println("child constructor");
	}

}
