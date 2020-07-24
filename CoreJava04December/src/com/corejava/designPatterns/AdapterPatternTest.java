package com.corejava.designPatterns;

//Demonstrates Adapter Design pattern in java
public class AdapterPatternTest {

	public static void main(String[] args) {
		SocketAdapter sockAdapter = new SocketAdapterImpl();
		Volt v3 = sockAdapter.get3Volt();
		Volt v12 = sockAdapter.get12Volt();
		Volt v120 = sockAdapter.get120Volt();
		System.out.println("v3 volts using Object Adapter=" + v3.getVolts());
		System.out.println("v12 volts using Object Adapter=" + v12.getVolts());
		System.out.println("v120 volts using Object Adapter=" + v120.getVolts());
	}

}
