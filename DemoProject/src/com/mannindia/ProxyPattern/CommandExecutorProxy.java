package com.mannindia.ProxyPattern;

public class CommandExecutorProxy implements CommandExecutor {

	private boolean isAdmin;
	private CommandExecutor executor;

	public CommandExecutorProxy(String username, String password) {
		if ("rahul".equals(username) && "rahul".equals(password)) {
			isAdmin = true;
			executor = new CommandExecutorImpl();
		}
	}

	@Override
	public void run(String name) throws Exception {
		if (isAdmin) {
			executor.run(name);
		} else {
			throw new Exception("username and password do not match");
		}

	}

	public boolean isAdmin() {
		return isAdmin;
	}

	public void setAdmin(boolean isAdmin) {
		this.isAdmin = isAdmin;
	}

	public CommandExecutor getExecutor() {
		return executor;
	}

	public void setExecutor(CommandExecutor executor) {
		this.executor = executor;
	}

}
