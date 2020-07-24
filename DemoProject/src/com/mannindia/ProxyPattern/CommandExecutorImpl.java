package com.mannindia.ProxyPattern;

public class CommandExecutorImpl implements CommandExecutor {

	@Override
	public void run(String name) {
		// some functionality to run
		System.out.println("run method invoked from CommandExecutorImpl:"+name);
	}

}
