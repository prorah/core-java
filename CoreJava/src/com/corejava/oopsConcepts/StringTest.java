package com.corejava.oopsConcepts;

public class StringTest {

	public static void main(String[] args) {
		String str1 = "abc";// creates object in String pool. Creating string
							// using the new keyword creates string object in
							// string heap.
		String str2 = str1 + "def";
		//System.out.println(str1 == str2);
		//System.out.println(str1.equals(str2));

		String str3 = "XYZ";
		String str4 = "INDIA";
		String str5 = "XYZINDIA";
		// intern creates the object in String pool memory. Intern method is
		// basically used to create a copy of object existing in string heap in
		// string pool
		String str6 = (str3 + str4).intern();
		// concat creates the object in heap memory
		String str7 = str3.concat(str4);
		 System.out.println(str5 == str6);
		 //System.out.println(str5.equals(str6));
	     //System.out.println(str5 == str7);
		 //System.out.println(str5.equals(str7));

		String str8 = "rahul";
		String str9 = "rah";
		String str10 = str8.substring(0, 3);
		//System.out.println(str10);
		//System.out.println(str9 == str10);
		//System.out.println(str9.equals(str10));
	}

}
