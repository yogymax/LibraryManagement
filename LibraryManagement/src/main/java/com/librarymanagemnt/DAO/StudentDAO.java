package com.librarymanagemnt.DAO;

import java.util.List;

import com.librarymanagemnt.BeanClasses.Student;

public interface StudentDAO {
	public void addStudent(Student stud);
	public void updateStudent(Student stud);
	public void deleteStudent(int studId);
	public Student getStudent(int studId);
	public List<Student> getAllStudent();
}
