package com.librarymanagemnt.classmain;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

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
		
		System.out.println("#################@@ LIBRARY_MANAGEMENT_SYSTEM @@#################");
		System.out.println("#################@@ WELCOME TO DIGITAL LIBRARY @@#################");
		
		Scanner sc= new Scanner(System.in);
		int key;
		do{
			System.out.println("1. STUDENTS"+"\n"+"2. BOOKS");
			System.out.println("*****Enter Your Choice*****");		
		    key=sc.nextInt();
		switch (key) {
		case 1 :
			StudentBo sbo = new StudentBoImpl();
			List<StudentBean> sl= new ArrayList<StudentBean>();
			System.out.println("#################@@ STUDENTS_INFORMATION @@#################");
			DepartmentBean db1 = new DepartmentBean(1,"CS");
			AuthorsBean ab1 = new AuthorsBean(1,"Dr. APJ KALAM");
			AuthorsBean ab2 = new AuthorsBean(2,"AchyutGodbole");
			BooksBean book2 = new BooksBean(101,"Wings of Fire","DARE","Autobiography",10,275,"n");
			BooksBean book4 = new BooksBean(102,"Kimayagar","SANE","Fiction",2,150,"y");
			StudentBean st1 = new StudentBean(3,"Anaya","Munge","munge@gmail.com","Female","N");
			StudentBean st2 = new StudentBean(4,"Juned","Kale","juned@gmail.com","Male","Y");
			//List<BooksBean> blist = new ArrayList<BooksBean>();
			int choice;
			do{
				System.out.println("1. ADDSTUDENT"+"\n"+"2. UPDATESTUDENT"+"\n"+"3. DELETESTUDENT"+"\n"+"4. GETSTUDENT"+"\n"+"5. LISTOFSTUDENTS");
				System.out.println("*****Enter Your Choice*****");
				 choice=sc.nextInt();
			switch (choice) {
			case 1:
			
			sbo.addStudent(st1,book2,db1,ab1);
			sbo.addStudent(st2,book4,db1,ab2);
			break;
			
			case 2 :
			sbo.updateStudent(st1);
			break;
			
			case 3:
			sbo.deleteStudent(st2);
			break;
			
		case 4:
			System.out.println("Enter identifier");
			int studid= sc.nextInt();
			st1=sbo.getStudent(studid);
			System.out.println(st1);
			break;
			
		case 5:
			sl=sbo.getAllStudent();
			System.out.println(sl);
			break;
			
		default:
			System.out.println("wrong choice");
			break;
		}
			}while(choice<=5);
			
		case 2 :
		System.out.println("#################@@ BOOKS_INFORMATION @@#################");
		int ch;
		//BooksBean book = new BooksBean(103,"2 States","GROWBIG","Autobiography",10,275,"y");
		BooksBean book1 = new BooksBean(102,"Kimayagar","SANE","Fiction",2,150,"y");
		BooksBean book5 = new BooksBean(104,"Half girlFriend","GROWBIG","Autobiography",3,175,"y");
		AuthorsBean ab = new AuthorsBean(2,"Durjoy Dutta");
		//AuthorsBean ab1 = new AuthorsBean(2,"Yashwant");

		BooksBo bkbo = new StudentBooksImpl();

		
		do{
			System.out.println("1. ADDBOOK"+"\n"+"2. UPDATEBOOK"+"\n"+"3. DELETEBOOK"+"\n"+"4. GETBOOK"+"\n"+"5. LISTOFBOOKS");
			System.out.println("*****Enter Your Choice*****");
			 ch=sc.nextInt();
		switch (ch) {
		case 1:
			bkbo.addBook(book5,ab);
			break;
			
		case 2 :
			bkbo.updateBook(book1);
			break;
			
		case 3:
			bkbo.deleteBook(book1);
			break;
			
		case 4:
			System.out.println("Enter identifier");
			int bookId1= sc.nextInt();
			BooksBean bok = bkbo.getBook(bookId1);
			System.out.println(bok);
			break;
			
		case 5:
			List<BooksBean> lbook = new ArrayList<BooksBean>();
			lbook=bkbo.listofbooks();
			for (Iterator<BooksBean> iterator = lbook.iterator(); iterator.hasNext();)
			{
				BooksBean books = iterator.next();
				System.out.println(books);
			}
			break;
			
		default:
			System.out.println("wrong choice");
			break;
		}
		}while(ch<=5);
		
		default:
			System.out.println("wrong choice");
			break;
		}
		}while(key<=2);
		sc.close();
		System.out.println("#############################THANK YOU#############################");

	}

}
