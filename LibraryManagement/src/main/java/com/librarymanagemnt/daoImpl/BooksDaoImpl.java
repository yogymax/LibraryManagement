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
import com.librarymanagemnt.utilities.HibernateUtility;

public class BooksDaoImpl implements BooksDao{

	public void addBook(BooksBean book) {
		// TODO Auto-generated method stub
		
	}

	public void updateBook(int studId) {
		// TODO Auto-generated method stub
		
	}

	public void deleteBook(int bookId) {
		
		Session session = HibernateUtility.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		//session.update(bk);
		
	}

	public BooksBean getBook(int bookId) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<BooksBean> listofbooks() {
		Session session = HibernateUtility.getSessionFactory().openSession();
		Transaction transaction = null;
		List<BooksBean> bk = new ArrayList();
		try {
			transaction = session.beginTransaction();
			bk = session.createQuery("from Books").list();
			for (Iterator iterator = bk.iterator(); iterator.hasNext();)
			{
				BooksBean books = (BooksBean) iterator.next();
				System.out.println(books.getBook_nm());
			}
			transaction.commit();
		} catch (HibernateException e) {
			transaction.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}
		return bk;
	}

}
