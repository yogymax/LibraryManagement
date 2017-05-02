package com.librarymanagemnt.DAO;

import java.util.List;

import com.librarymanagemnt.BeanClasses.Books;

public interface BooksDAO {
	public void addBook(Books book);
	public void updateBook(Books book);
	public void deleteBook(int bookId);
	public Books getBook(int bookId);
	public List<Books> listofbooks();
	
}
