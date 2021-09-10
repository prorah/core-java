package com.demo.singleton;

public class SingletonPatternTest {

	public static void main(String[] args) {
		SingletonTest instance1=SingletonTest.getInstance();
		SingletonTest instance2=SingletonTest.getInstance();
		System.out.println(instance1.hashCode());
		System.out.println(instance2.hashCode());

	}

}
