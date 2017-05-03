package com.librarymanagemnt.classmain;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.librarymanagemnt.beanclasses.BooksBean;
import com.librarymanagemnt.beanclasses.StudentBean;
import com.librarymanagemnt.boimpl.StudentBoImpl;
import com.librarymanagemnt.boimpl.StudentBooksImpl;
import com.librarymanagemnt.bointerfaces.BooksBo;
import com.librarymanagemnt.bointerfaces.StudentBo;

public class Test {

	public static void main(String[] args) {
		
		System.out.println("1. ADDSTUDENT"+"\n"+"2. UPDATESTUDENT"+"\n"+"3. DELETESTUDENT"+"\n"+"4. GETSTUDENT"+"\n"+"5. LISTOFSTUDENTS");
		Scanner sc= new Scanner(System.in);
		int choice=sc.nextInt();
		switch (choice) {
		case 1:
			StudentBean st1 = new StudentBean(1,"Ranjit","Patil","patil.ranjit@gmail.com","Male"); 
			StudentBo sbo = new StudentBoImpl();
			sbo.addStudent(st1);
			break;

		default:
			System.out.println("wrong choice");
			break;
		}
		
		
		
		
		BooksBean book = new BooksBean(101,"Complete_Reference_Java","Tata","Educational",5,450);
		BooksBo bkbo = new StudentBooksImpl();
		bkbo.addBook(book);
		List<BooksBean> lbook = new ArrayList<BooksBean>();
		lbook=bkbo.listofbooks();
		for (Iterator iterator = lbook.iterator(); iterator.hasNext();)
		{
			BooksBean books = (BooksBean) iterator.next();
			System.out.println(books.getBook_nm());
		}
		
		
		

	}

}
