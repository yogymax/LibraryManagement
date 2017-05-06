package com.librarymanagemnt.entitybeans;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table
public class DepartmentEntity {

	@Id
	@Column
	//@GeneratedValue(strategy= GenerationType.IDENTITY) 
	//deptId
	private int deptId;
	
	@Column
		//deptName
	private String deptName;
	@OneToMany(cascade=CascadeType.ALL,mappedBy="dept")
	private Set<StudentEntity> students;
	public Set<StudentEntity> getStudents() {
		return students;
	}

	public void setStudents(Set<StudentEntity> students) {
		this.students = students;
	}

	public int getDeptId() {
		return deptId;
	}

	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public DepartmentEntity(int deptId, String deptName) {
		super();
		this.deptId = deptId;
		this.deptName = deptName;
	}

	public DepartmentEntity() {
		super();
		
	}

	@Override
	public String toString() {
		return "DepartmentEntity [deptId=" + deptId + ", deptName=" + deptName + "]";
	}
	
	
}
