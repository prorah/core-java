package com.corejava.overridingTest;

public class Developer extends Employee {
	private int empId;

	@Override
	public void displayClassName() {
		System.out.println("Developer class method invoked");
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

}
