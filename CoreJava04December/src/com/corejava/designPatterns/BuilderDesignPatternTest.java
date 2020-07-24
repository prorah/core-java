package com.corejava.designPatterns;

public class BuilderDesignPatternTest {

	public static void main(String[] args) {
		Computer computer = new Computer.ComputerBuilder(4, 128).setBluetooth(true).setGraphicsCard(true).build();
		System.out.println(computer);
	}

}
