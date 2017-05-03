package com.librarymanagemnt.daointerfaces;

import java.util.List;

import com.librarymanagemnt.beanclasses.BooksBean;

public interface BooksDao {
	public void addBook(BooksBean book);
	public void updateBook(int bookId);
	public void deleteBook(int bookId);
	public BooksBean getBook(int bookId);
	public List<BooksBean> listofbooks();
	
}
