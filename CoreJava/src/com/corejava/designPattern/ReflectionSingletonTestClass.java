package com.corejava.designPattern;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ReflectionSingletonTestClass {
	public static void main(String[] args)
			throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {

		// The below 2 references point to the same object
		LazyInitializationSingletonClass lazyInitializationSingletonClass1 = LazyInitializationSingletonClass
				.getInstance();
		LazyInitializationSingletonClass lazyInitializationSingletonClass2 = LazyInitializationSingletonClass
				.getInstance();

		// Same hashcode
		System.out.println(lazyInitializationSingletonClass1.hashCode());
		System.out.println(lazyInitializationSingletonClass2.hashCode());

		LazyInitializationSingletonClass lazyInitializationSingletonClass3 = null;
		Constructor[] constructor = LazyInitializationSingletonClass.class.getDeclaredConstructors();
		for (Constructor cons : constructor) {
			cons.setAccessible(true);
			lazyInitializationSingletonClass3 = (LazyInitializationSingletonClass) cons.newInstance();
		}
		System.out.println(lazyInitializationSingletonClass3.hashCode());
	}
}
