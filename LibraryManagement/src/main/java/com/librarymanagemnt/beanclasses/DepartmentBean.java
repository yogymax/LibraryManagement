package com.librarymanagemnt.beanclasses;

public class DepartmentBean {

	
	//deptId
	private int dept_Id;
	//deptName
	private String dept_nm;
	public int getDept_Id() {
		return dept_Id;
	}
	public void setDept_Id(int dept_Id) {
		this.dept_Id = dept_Id;
	}
	public String getDept_nm() {
		return dept_nm;
	}
	public void setDept_nm(String dept_nm) {
		this.dept_nm = dept_nm;
	}
	public DepartmentBean(int dept_Id, String dept_nm) {
		super();
		this.dept_Id = dept_Id;
		this.dept_nm = dept_nm;
	}
	public DepartmentBean() {
		super();
	}
	@Override
	public String toString() {
		return "DepartmentBean [dept_Id=" + dept_Id + ", dept_nm=" + dept_nm + "]";
	}
	
	
	
}
