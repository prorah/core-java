package com.demo.inheritance;

public interface InterfaceA {
	default void display() {
		System.out.println("from Interface A");
	}

}
