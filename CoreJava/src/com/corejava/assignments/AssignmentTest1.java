package com.corejava.assignments;

public class AssignmentTest1 {

	public static void main(String[] args) {
		Integer i1=new Integer(1);
		int i2=new Integer(1);
		System.out.println(i1.equals(i2));
		System.out.println(i1==i2);
		
		
		byte a = 3;
		byte b = 8;
		byte c =  (byte) (a + b); // explicit cast is required as sum of two
									// bytes is an int. This is called narrowing
									// conversion.
		System.out.println(c);

		float d = 100.00f;// Floating point literals are defined as double by
							// default and therefore we need to add "F" to store
							// it in a float variable.
		
		byte e=3;
		e+=7; //This is equivalent to e=e+7 and results in an int but the compound assignment operator puts a cast automatically.
		System.out.println(e);
		
		e=(byte)(e+7); //results in an int and therefore casting is required.
		
		short s=7;
		System.out.println(Short.valueOf((Short)s));
	}

}
