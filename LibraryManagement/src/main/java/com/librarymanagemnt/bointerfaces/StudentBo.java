package com.librarymanagemnt.bointerfaces;

import java.util.List;

import com.librarymanagemnt.beanclasses.StudentBean;
import com.librarymanagemnt.entitybeans.StudentEntity;

public interface StudentBo {
	
	
	public void addStudent(StudentBean stud);
	public void updateStudent(int studId);
	public void deleteStudent(int studId);
	public StudentBean getStudent(int studId);
	public List<StudentBean> getAllStudent();
	public StudentBean EntityToBean(StudentEntity student);
	public StudentEntity BeanToEntity(StudentBean studbean);
}
