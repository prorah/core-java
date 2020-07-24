package com.mannindia.demo;

public class Test {

	public static void main(String[] args) {
		String[] strArray = { "", "", "", "", "", "" };
		System.out.println(strArray.length);
		String str = ";;;;;";
		strArray = str.split("\\;");
		System.out.println(strArray.length);
	}

}
