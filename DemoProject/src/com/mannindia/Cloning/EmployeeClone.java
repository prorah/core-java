package com.mannindia.Cloning;

public class EmployeeClone implements Cloneable {
	private int id;
	private String name;
	private DepartmentClone department;

	public EmployeeClone(int id, String name, DepartmentClone department) {
		super();
		this.id = id;
		this.name = name;
		this.department = department;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public DepartmentClone getDepartment() {
		return department;
	}

	public void setDepartment(DepartmentClone department) {
		this.department = department;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		EmployeeClone clone = (EmployeeClone) super.clone();
		clone.setDepartment((DepartmentClone) clone.getDepartment().clone());
		return clone;
	}

}
