package com.librarymanagemnt.daointerfaces;

import java.util.List;

import com.librarymanagemnt.entitybeans.AuthorsEntity;
import com.librarymanagemnt.entitybeans.BooksEntity;
import com.librarymanagemnt.entitybeans.DepartmentEntity;
import com.librarymanagemnt.entitybeans.StudentEntity;

public interface StudentDao {
	
	public void deleteStudent(StudentEntity st);
	public StudentEntity getStudent(int studId);
	public List<StudentEntity> getAllStudent();
	public void updateStudent(StudentEntity stent);
	public void addStudent(StudentEntity stent, BooksEntity bent, DepartmentEntity dent, AuthorsEntity aent);
}
