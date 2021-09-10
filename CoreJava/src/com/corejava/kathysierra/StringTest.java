package com.corejava.kathysierra;

public class StringTest {

	public static void main(String[] args) {
		String a = "abc";
		String b = new String("abc");
		String c = a.trim();
		// System.out.println(a);
		// System.out.println(c);
		
		System.out.println(a.equals(b));
		System.out.println(a.hashCode());
		System.out.println(b.hashCode());
		System.out.println(a == b);

	}

}
