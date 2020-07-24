package com.corejava.designPatterns;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class SingletonReflectionsTest {

	public static void main(String[] args)
			throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		SingletonDesignPattern instanceA = SingletonDesignPattern.getInstance();
		System.out.println(instanceA.hashCode());
		Constructor[] constructors = SingletonDesignPattern.class.getDeclaredConstructors();
		SingletonDesignPattern instanceB = null;
		for (Constructor constructor : constructors) {
			constructor.setAccessible(true);
			instanceB = (SingletonDesignPattern) constructor.newInstance();
			break;
		}
		System.out.println(instanceB.hashCode());

	}

}
