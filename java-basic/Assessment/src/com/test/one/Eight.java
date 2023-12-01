package com.test.one;

public final class Eight {
	private final int empno;
	private final String empname;
	private final String dept;

	public int getEmpno() {
		return empno;
	}

	public String getEmpname() {
		return empname;
	}

	public String getDept() {
		return dept;
	}

	public Eight(int empno, String empname, String dept) {
		this.empno = empno;
		this.empname = empname;
		this.dept = dept;
	}
}
