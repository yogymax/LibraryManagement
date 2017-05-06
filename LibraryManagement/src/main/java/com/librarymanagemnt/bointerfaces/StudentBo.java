package com.librarymanagemnt.bointerfaces;

import java.util.List;

import com.librarymanagemnt.beanclasses.AuthorsBean;
import com.librarymanagemnt.beanclasses.BooksBean;
import com.librarymanagemnt.beanclasses.DepartmentBean;
import com.librarymanagemnt.beanclasses.StudentBean;
import com.librarymanagemnt.entitybeans.AuthorsEntity;
import com.librarymanagemnt.entitybeans.BooksEntity;
import com.librarymanagemnt.entitybeans.DepartmentEntity;
import com.librarymanagemnt.entitybeans.StudentEntity;

public interface StudentBo {
	
	public void addStudent(StudentBean sl, BooksBean blist, DepartmentBean db1, AuthorsBean ab);
	public void updateStudent(StudentBean st1);
	public void deleteStudent(StudentBean st1);
	public StudentBean getStudent(int studId);
	public List<StudentBean> getAllStudent();
	
	public StudentBean entityToBean(StudentEntity student);
	public StudentEntity beanToEntity(StudentBean studbean);
	public BooksBean entityToBean(BooksEntity bookent);
	public BooksEntity beanToEntity(BooksBean bookbean);
	public AuthorsBean entityToBean(AuthorsEntity authent);
	public AuthorsEntity beanToEntity(AuthorsBean authbean);
	public DepartmentBean entityToBean(DepartmentEntity dent);
	public DepartmentEntity beanToEntity(DepartmentBean dbean);
	
}
