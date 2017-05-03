package com.librarymanagemnt.classmain;

import java.util.ArrayList;
import java.util.List;

import com.librarymanagemnt.beanclasses.AuthorsBean;
import com.librarymanagemnt.beanclasses.BooksBean;
import com.librarymanagemnt.beanclasses.DepartmentBean;
import com.librarymanagemnt.beanclasses.StudentBean;
import com.librarymanagemnt.boimpl.StudentBoImpl;
import com.librarymanagemnt.boimpl.StudentBooksImpl;
import com.librarymanagemnt.bointerfaces.BooksBo;
import com.librarymanagemnt.bointerfaces.StudentBo;

public class Test {

	public static void main(String[] args) {
		
		StudentBean st1 = new StudentBean(1,"Ranjit","Patil","patil.ranjit@gmail.com","Male"); 
		StudentBo sbo = new StudentBoImpl();
		sbo.addStudent(st1);
		
		
		
		/*Books bk1 = new Books();
		BooksBO bkbo = new StudentBooksImpl();
		bkbo.listofbooks();*/
		
		
		

	}

}
