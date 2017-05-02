package com.librarymanagemnt.BO;

import java.util.List;

import com.librarymanagemnt.BeanClasses.Student;

public interface StudentBO {
	
	
	public void addStudent(Student stud);
	public void updateStudent(Student stud);
	public void deleteStudent(int studId);
	public Student getStudent(int studId);
	public List<Student> getAllStudent();
	
}
