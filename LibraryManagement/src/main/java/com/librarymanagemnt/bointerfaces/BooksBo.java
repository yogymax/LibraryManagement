package com.librarymanagemnt.bointerfaces;

import java.util.List;

import com.librarymanagemnt.beanclasses.AuthorsBean;
import com.librarymanagemnt.beanclasses.BooksBean;
import com.librarymanagemnt.entitybeans.AuthorsEntity;
import com.librarymanagemnt.entitybeans.BooksEntity;

public interface BooksBo {

	public void addBook(BooksBean book, AuthorsBean ab);
	public void deleteBook(BooksBean book);
	public BooksBean getBook(int bookId);
	public List<BooksBean> listofbooks();
	public BooksBean EntityToBean(BooksEntity bookent);
	public BooksEntity BeanToEntity(BooksBean bookbean);
	public void updateBook(BooksBean book);
	public AuthorsBean EntityToBean(AuthorsEntity authent);
	public AuthorsEntity BeanToEntity(AuthorsBean authbean);
}
