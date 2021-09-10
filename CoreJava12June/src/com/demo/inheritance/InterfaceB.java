package com.demo.inheritance;

public interface InterfaceB {
	default void display() {
		System.out.println("from Interface A");
	}
}
