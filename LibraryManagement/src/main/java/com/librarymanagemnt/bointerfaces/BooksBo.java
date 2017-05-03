package com.librarymanagemnt.bointerfaces;

import java.util.List;

import com.librarymanagemnt.beanclasses.BooksBean;
import com.librarymanagemnt.beanclasses.StudentBean;
import com.librarymanagemnt.entitybeans.BooksEntity;
import com.librarymanagemnt.entitybeans.StudentEntity;

public interface BooksBo {

	public void addBook(BooksBean book);
	public void updateBook(int bookId);
	public void deleteBook(int bookId);
	public BooksBean getBook(int bookId);
	public List<BooksBean> listofbooks();
	public BooksBean EntityToBean(BooksEntity bookent);
	public BooksEntity BeanToEntity(BooksBean bookbean);
}
