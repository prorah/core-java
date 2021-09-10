package com.demo.singleton;

import java.io.Serializable;

public class SingletonTest implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static SingletonTest instance;

	private SingletonTest() {
	}

	public static SingletonTest getInstance() {
		if (instance == null) {
			synchronized (SingletonTest.class) {
				if (instance == null) {
					instance = new SingletonTest();
				}
			}
		}
		return instance;
	}
	
	protected Object readResolve(){
		return getInstance();
	}

}
