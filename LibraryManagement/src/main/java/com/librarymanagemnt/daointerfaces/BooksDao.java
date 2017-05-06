package com.librarymanagemnt.daointerfaces;

import java.util.List;

import com.librarymanagemnt.entitybeans.AuthorsEntity;
import com.librarymanagemnt.entitybeans.BooksEntity;

public interface BooksDao {
	
	public void updateBook(BooksEntity book);
	public BooksEntity getBook(int bookId);
	public List<BooksEntity> listofbooks();
	public void addBook(BooksEntity bent, AuthorsEntity ae);
	public void deleteBook(BooksEntity bent);
	
}
