package com.corejava.designPattern;

public class SingletonCloneableTest {

	public static void main(String[] args) throws CloneNotSupportedException {
		SingletonCloneable singleton1 = SingletonCloneable.getInstance();
		SingletonCloneable singleton2 = (SingletonCloneable) singleton1.clone();
		System.out.println(singleton1.hashCode());
		System.out.println(singleton2.hashCode());
		System.out.println(singleton1 == singleton2);
		System.out.println(singleton1.equals(singleton2));
	}

}
