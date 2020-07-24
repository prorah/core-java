package com.mannindia.ProxyPattern;

public class ProxyPatternTest {

	public static void main(String[] args) throws Exception {
		CommandExecutorProxy proxy = new CommandExecutorProxy("rahul", "rahul");
		proxy.run("rahul");

	}

}
