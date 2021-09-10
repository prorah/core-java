package com.corejava.kathysierra;

public class DepartmentCloning implements Cloneable{
	private int deptSize;

	public int getDeptSize() {
		return deptSize;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	public void setDeptSize(int deptSize) {
		this.deptSize = deptSize;
	}

}
