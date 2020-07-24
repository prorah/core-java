package com.mannindia.demo;

public class SingletonDesignPatternTest {

	public static void main(String[] args) {

		SingletonDesignPattern singleDesignPattern = SingletonDesignPattern
				.getInstance();
		SingletonDesignPattern singleDesignPattern2 = SingletonDesignPattern
				.getInstance();
		System.out.println(singleDesignPattern.equals(singleDesignPattern2));

	}
}
