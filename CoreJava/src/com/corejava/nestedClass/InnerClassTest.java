package com.corejava.nestedClass;

//This class demonstrates the usage of regular inner classes
public class InnerClassTest {

	public static void main(String[] args) {
		MyOuterClass mo = new MyOuterClass();
		mo.outerMethod();
		MyOuterClass.MyInner mi = mo.new MyInner();
		mi.innerMethod();

	}

}
