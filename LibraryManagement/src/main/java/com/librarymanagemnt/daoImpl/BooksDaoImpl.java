package com.librarymanagemnt.daoImpl;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.librarymanagemnt.daointerfaces.BooksDao;
import com.librarymanagemnt.entitybeans.AuthorsEntity;
import com.librarymanagemnt.entitybeans.BooksEntity;
import com.librarymanagemnt.utilities.HibernateUtility;

public class BooksDaoImpl implements BooksDao{

	public void addBook(BooksEntity book, AuthorsEntity ae) {
		Session session = HibernateUtility.getSessionFactory().openSession();
		Transaction ts = session.beginTransaction();
		Set <AuthorsEntity> aset = new HashSet<AuthorsEntity>();
		aset.add(ae);
		//book.setAuthors(aset);
		session.save(book);
		System.out.println("successfully added");
		HibernateUtility.resourceCleanUp(session, ts);
		
	}

	public void updateBook(BooksEntity book) {
		Session session = HibernateUtility.getSessionFactory().getCurrentSession();
		Transaction ts = session.beginTransaction();
		
		session.update(book);
	
		HibernateUtility.resourceCleanUp(session, ts);
	}

	public void deleteBook(BooksEntity bookent) {
		
		Session session = HibernateUtility.getSessionFactory().getCurrentSession();
		Transaction ts = session.beginTransaction();
		
		session.update(bookent);
		System.out.println("successfully deleted");
		HibernateUtility.resourceCleanUp(session, ts);
		
	}

	public BooksEntity getBook(int bookId) {
		Session session = HibernateUtility.getSessionFactory().openSession();
		Transaction ts = null;
	    ts = session.beginTransaction();
		BooksEntity bookent = (BooksEntity)session.get(BooksEntity.class, bookId);
		HibernateUtility.resourceCleanUp(session,ts );
		
		if(bookent.getActive().equalsIgnoreCase("y"))
		{
			System.out.println(bookent);
			return bookent;
		}
		return bookent;
	}

	@SuppressWarnings("unchecked")
	public List<BooksEntity> listofbooks() {
		Session session = HibernateUtility.getSessionFactory().openSession();
		Transaction transaction = null;
		List<BooksEntity> bk = new ArrayList<BooksEntity>();
			transaction = session.beginTransaction();
			
			bk = session.createQuery("from BooksEntity").list();
			HibernateUtility.resourceCleanUp(session, transaction);
			for (Iterator<BooksEntity> iterator = bk.iterator(); iterator.hasNext();)
			{
				BooksEntity bookent = iterator.next();
				if(bookent.getActive().equalsIgnoreCase("y"))
				{
					bk.add(bookent);
				}
			}
			
		return bk;
	}

}
