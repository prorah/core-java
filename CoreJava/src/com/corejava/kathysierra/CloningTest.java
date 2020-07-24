package com.corejava.kathysierra;

public class CloningTest {

	public static void main(String[] args) throws CloneNotSupportedException {
		EmployeeCloning emp = new EmployeeCloning();
		DepartmentCloning dept=new DepartmentCloning();
		dept.setDeptSize(12);
		emp.setAge(26);
		emp.setName("A");
		emp.setDepartment(dept);

		EmployeeCloning empClone = (EmployeeCloning) emp.clone();
		empClone.getDepartment().setDeptSize(13);
		System.out.println(emp.getDepartment().getDeptSize());
		System.out.println(empClone.getDepartment().getDeptSize());
		System.out.println(emp.getDepartment().hashCode());
		System.out.println(empClone.getDepartment().hashCode());

	}

}
