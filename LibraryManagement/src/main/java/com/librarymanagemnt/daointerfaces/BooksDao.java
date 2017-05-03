package com.librarymanagemnt.daointerfaces;

import java.util.List;

import com.librarymanagemnt.beanclasses.BooksBean;
import com.librarymanagemnt.entitybeans.BooksEntity;

public interface BooksDao {
	
	public void updateBook(int bookId);
	public void deleteBook(int bookId);
	public BooksBean getBook(int bookId);
	public List<BooksEntity> listofbooks();
	public void addBook(BooksEntity stent);
	
}
