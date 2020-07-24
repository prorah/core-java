package com.corejava.designPattern;

//In eager initialization the singleton class instance is created even when it is not required. Eager initialization can be 
//done either as below or by using static block
public class SingletonPatternEagerinitialization {

	public static final SingletonPatternEagerinitialization instance = new SingletonPatternEagerinitialization();

	private SingletonPatternEagerinitialization() {
	}

	public static SingletonPatternEagerinitialization returnInstance() {
		return instance;

	}

}
