package com.librarymanagemnt.boimpl;

import java.util.ArrayList;
import java.util.List;

import com.librarymanagemnt.beanclasses.BooksBean;
import com.librarymanagemnt.bointerfaces.BooksBo;
import com.librarymanagemnt.daoImpl.BooksDaoImpl;
import com.librarymanagemnt.daoImpl.StudentDaoImpl;
import com.librarymanagemnt.daointerfaces.BooksDao;
import com.librarymanagemnt.daointerfaces.StudentDao;
import com.librarymanagemnt.entitybeans.BooksEntity;

public class StudentBooksImpl implements BooksBo {

	BooksDao stdao = new BooksDaoImpl();
	
	public void addBook(BooksBean book) {
		// TODO Auto-generated method stub
		
	}

	public void updateBook(int bookId) {
		// TODO Auto-generated method stub
		
	}

	public void deleteBook(int bookId) {
		
		stdao.deleteBook(bookId);
	}

	public BooksBean getBook(int bookId) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<BooksBean> listofbooks() {
		BooksDao bd = new BooksDaoImpl();
		List<BooksBean> bbk = new ArrayList<BooksBean>();
		bbk=bd.listofbooks();
		return bbk;
	}

	public BooksBean EntityToBean(BooksEntity bookent) {
		// TODO Auto-generated method stub
		return null;
	}

	public BooksEntity BeanToEntity(BooksBean bookbean) {
		// TODO Auto-generated method stub
		return null;
	}

}
