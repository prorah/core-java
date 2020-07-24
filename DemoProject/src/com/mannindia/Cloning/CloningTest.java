package com.mannindia.Cloning;

public class CloningTest {

	public static void main(String[] args) throws CloneNotSupportedException {
		DepartmentClone dept = new DepartmentClone(1, "HR");
		EmployeeClone original = new EmployeeClone(1, "rahul", dept);
		EmployeeClone clone = (EmployeeClone) original.clone();
		System.out.println(clone == original);
		System.out.println(clone.equals(original));
		clone.getDepartment().setName("finance");
		System.out.println(original.getDepartment().getName());
	}

}
