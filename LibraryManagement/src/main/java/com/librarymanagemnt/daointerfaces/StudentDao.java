package com.librarymanagemnt.daointerfaces;

import java.util.List;

import com.librarymanagemnt.beanclasses.StudentBean;
import com.librarymanagemnt.entitybeans.StudentEntity;

public interface StudentDao {
	
	public void updateStudent(int studId);
	public void deleteStudent(int studId);
	public StudentEntity getStudent(int studId);
	public List<StudentEntity> getAllStudent();
	public void addStudent(StudentEntity stent);
}
