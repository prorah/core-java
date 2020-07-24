package com.corejava.oopsConcepts;

class StaticVariableClass {
	static int frogCount = 0;

	public StaticVariableClass() {
		frogCount = frogCount + 1;
	}
}

class StaticVariableTestClass {
	public static void main(String[] args) {
		new StaticVariableClass();
		new StaticVariableClass();
		new StaticVariableClass();
		System.out.println(StaticVariableClass.frogCount);
	}
}
