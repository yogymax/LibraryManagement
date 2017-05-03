package com.librarymanagemnt.boimpl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.librarymanagemnt.beanclasses.BooksBean;
import com.librarymanagemnt.beanclasses.StudentBean;
import com.librarymanagemnt.bointerfaces.BooksBo;
import com.librarymanagemnt.daoImpl.BooksDaoImpl;
import com.librarymanagemnt.daoImpl.StudentDaoImpl;
import com.librarymanagemnt.daointerfaces.BooksDao;
import com.librarymanagemnt.daointerfaces.StudentDao;
import com.librarymanagemnt.entitybeans.BooksEntity;
import com.librarymanagemnt.entitybeans.StudentEntity;

public class StudentBooksImpl implements BooksBo {

	BooksDao stdao = new BooksDaoImpl();
	
	public void addBook(BooksBean book) {
		BooksEntity stent= BeanToEntity(book);
		stdao.addBook(stent);
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
	
		List<BooksEntity> bbk = new ArrayList<BooksEntity>();
		bbk=stdao.listofbooks();
		List<BooksBean> bb = new ArrayList<BooksBean>();
		
		for (Iterator iterator = bbk.iterator(); iterator.hasNext();)
		{
			BooksEntity books = (BooksEntity) iterator.next();
			BooksBean bo =  EntityToBean(books);
			bb.add(bo);
		}
		return bb;
	}

	public BooksBean EntityToBean(BooksEntity bookent) {
		// TODO Auto-generated method stub
		BooksBean sb = new BooksBean();
		sb.setBook_Id(bookent.getBookId());
		sb.setBook_nm(bookent.getBookName());
		sb.setPub_nm(sb.getPub_nm());
		sb.setType(bookent.getType());
		sb.setQuanity(bookent.getQuantity());
		sb.setPrice(bookent.getPrice());
		return sb;
		
	}

	public BooksEntity BeanToEntity(BooksBean bookbean) {
		BooksEntity se = new BooksEntity();
		se.setBookId(bookbean.getBook_Id());
		se.setBookName(bookbean.getBook_nm());
		se.setPub_nm(bookbean.getPub_nm());
		se.setType(bookbean.getType());
		se.setQuantity(bookbean.getQuanity());
		se.setPrice(bookbean.getPrice());
		return se;
	}
}
