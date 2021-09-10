package com.test.GL;

public class DemoTest1 {

	public static void main(String[] args) {
		A ob1 = new A();
		A ob2 = new A();
		ob1.i = 10;
		System.out.println(ob2.i);
		ob2.a = 30;
		System.out.println(ob1.a);
		ob2.i=ob1.a + 5;
		System.out.println(A.i);
	}
	
	
}

class A{
	static int i = 0;
	int a= 20;
	
}
