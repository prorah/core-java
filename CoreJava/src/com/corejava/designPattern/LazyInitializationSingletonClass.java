package com.corejava.designPattern;

//This class demonstrates Lazy Initialization Singleton class. Instance is created only when required
public class LazyInitializationSingletonClass {
	private static LazyInitializationSingletonClass instance;

	private LazyInitializationSingletonClass() {
	};

	public static LazyInitializationSingletonClass getInstance() {
		if (instance == null) {
			instance = new LazyInitializationSingletonClass();
		}
		return instance;
	}

}
