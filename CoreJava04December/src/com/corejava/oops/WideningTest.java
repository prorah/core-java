package com.corejava.oops;

//This class demonstrates widening beats boxing and widening beats var-args
public class WideningTest {

	public static void main(String[] args) {
		int a = 25;
		int b=25;
		testMethod(a);
		testMethod1(a,b);

	}

	public static void testMethod(Integer i) {
		System.out.println("boxing");
	}

	public static void testMethod(long l) {
		System.out.println("widening");
	}
	
	public static void testMethod1(long l1,long l2) {
		System.out.println("widening");
	}
	
	public static void testMethod1(int...i) {
		System.out.println("var-args");
	}

}
