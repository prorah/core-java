package com.corejava.designPattern;

public class SingletonCloneable implements Cloneable {
	private static SingletonCloneable instance;

	private SingletonCloneable() {
	};

	@Override
	protected Object clone() throws CloneNotSupportedException  {
		/*if (instance != null) {
			throw new CloneNotSupportedException("One instance already exists in JVM");
		}*/
		return super.clone();
	}

	public static SingletonCloneable getInstance() {
		if (instance == null) {
			instance = new SingletonCloneable();
		}
		return instance;
	}
}
