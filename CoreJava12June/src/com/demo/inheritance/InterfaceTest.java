package com.demo.inheritance;

public class InterfaceTest {

	public static void main(String[] args) {
		InterfaceA a = new C();
	}

}

class C implements InterfaceA,InterfaceB {

	@Override
	public void display() {
		// TODO Auto-generated method stub
		InterfaceA.super.display();
	}

}
