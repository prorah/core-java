package com.corejava.designPatterns;

import java.io.Serializable;

//Lazy Initialization
public class SingletonDesignPattern implements Serializable {

	private static SingletonDesignPattern instance=null;

	private SingletonDesignPattern() {
	}

	public static SingletonDesignPattern getInstance() {
		if (instance == null) {
			instance = new SingletonDesignPattern();
		}
		return instance;
	}

	protected Object readResolve() {
		return getInstance();
	}

}
