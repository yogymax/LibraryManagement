package com.librarymanagemnt.daoImpl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.librarymanagemnt.beanclasses.BooksBean;
import com.librarymanagemnt.daointerfaces.BooksDao;
import com.librarymanagemnt.entitybeans.BooksEntity;
import com.librarymanagemnt.utilities.HibernateUtility;

public class BooksDaoImpl implements BooksDao{

	public void addBook(BooksEntity book) {
		Session session = HibernateUtility.getSessionFactory().openSession();
		Transaction ts = session.beginTransaction();
		session.save(book);
		System.out.println("successfully added");
		HibernateUtility.resourceCleanUp(session, ts);
		
	}

	public void updateBook(int studId) {
		// TODO Auto-generated method stub
		
	}

	public void deleteBook(int bookId) {
		
		//Session session = HibernateUtility.getSessionFactory().openSession();
		//Transaction transaction = session.beginTransaction();
		//session.update(bk);
		
	}

	public BooksBean getBook(int bookId) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<BooksEntity> listofbooks() {
		Session session = HibernateUtility.getSessionFactory().openSession();
		Transaction transaction = null;
		List<BooksEntity> bk = new ArrayList();
			transaction = session.beginTransaction();
			bk = session.createQuery("from BooksEntity").list();
			HibernateUtility.resourceCleanUp(session, transaction);
		return bk;
	}

}
