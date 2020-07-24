package com.mannindia.demo;

public class SingletonDesignPattern {

	private static SingletonDesignPattern singletonDesignPattern;

	private SingletonDesignPattern() {
	}

	public static SingletonDesignPattern getInstance() {
		if (singletonDesignPattern == null) {
			singletonDesignPattern = new SingletonDesignPattern();
		}
		return singletonDesignPattern;
	}

}
