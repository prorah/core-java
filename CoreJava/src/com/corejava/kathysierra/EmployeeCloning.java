package com.corejava.kathysierra;

public class EmployeeCloning implements Cloneable {
	private int age;
	private String name;
	private DepartmentCloning department;

	// Overriden clone method for deep cloning
	@Override
	protected Object clone() throws CloneNotSupportedException {
		EmployeeCloning emp = (EmployeeCloning) super.clone();
		emp.setDepartment((DepartmentCloning) (emp.getDepartment().clone()));
		return emp;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public DepartmentCloning getDepartment() {
		return department;
	}

	public void setDepartment(DepartmentCloning department) {
		this.department = department;
	}

}
