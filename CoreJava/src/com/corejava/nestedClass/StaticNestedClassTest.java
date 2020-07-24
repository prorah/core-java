package com.corejava.nestedClass;

public class StaticNestedClassTest {
	static class StaticNestedInnerClass2 {
		public void staticNestedInnerClassMethod2() {
			System.out.println("method of static nested inner class 2 called");
		}
	}

	public static void main(String[] args) {
		StaticNestedInnerClass2 staticInner2 = new StaticNestedInnerClass2();
		staticInner2.staticNestedInnerClassMethod2();
		StaticNestedClass.NestedInnerClass innerNested = new StaticNestedClass.NestedInnerClass();// static
																									// inner
																									// class
																									// can
																									// be
																									// accessed
																									// without
																									// an
																									// instance
																									// of
																									// the
																									// outer
																									// class.
		innerNested.nestedInnerClassMethod();
	}

}
