package com.corejava.cloning;

public class Course implements Cloneable {
	private String subject1;

	public String getSubject1() {
		return subject1;
	}

	public void setSubject1(String subject1) {
		this.subject1 = subject1;
	}

	public Course(String subject1) {
		super();
		this.subject1 = subject1;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

}
