package com.librarymanagemnt.daoImpl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.librarymanagemnt.daointerfaces.StudentDao;
import com.librarymanagemnt.entitybeans.AuthorsEntity;
import com.librarymanagemnt.entitybeans.BooksEntity;
import com.librarymanagemnt.entitybeans.DepartmentEntity;
import com.librarymanagemnt.entitybeans.StudentEntity;
import com.librarymanagemnt.utilities.HibernateUtility;

public class StudentDaoImpl implements StudentDao {

	public void addStudent(StudentEntity stud,BooksEntity blist,DepartmentEntity de, AuthorsEntity ae) {
		
		Session session = HibernateUtility.getSessionFactory().openSession();
		Transaction ts = session.beginTransaction();
		
			 stud.setBooks(blist);
			stud.setDept(de);
			blist.setAuthors(ae);
			session.save(stud);
		HibernateUtility.resourceCleanUp(session, ts);
		
	}

	public void updateStudent(StudentEntity stent) {
		
		Session session = HibernateUtility.getSessionFactory().openSession();
		Transaction ts = session.beginTransaction();
		
		session.update(stent);
		
		HibernateUtility.resourceCleanUp(session, ts);
	}

	public void deleteStudent(StudentEntity st) {
		
		Session session = HibernateUtility.getSessionFactory().openSession();
		Transaction ts = session.beginTransaction();
		
		session.update(st);
		
		HibernateUtility.resourceCleanUp(session, ts);
	}

	public StudentEntity getStudent(int studId) {
		Session session = HibernateUtility.getSessionFactory().openSession();
		Transaction ts = session.beginTransaction();
		StudentEntity bookent = (StudentEntity)session.get(StudentEntity.class, studId);
		HibernateUtility.resourceCleanUp(session, ts);
		if(bookent.getActive().equalsIgnoreCase("y")){
			return bookent;
		}
		return bookent;
	}

	@SuppressWarnings("unchecked")
	public List<StudentEntity> getAllStudent() {
		Session session = HibernateUtility.getSessionFactory().openSession();
		Transaction transaction = null;
		List<StudentEntity> bk = new ArrayList<StudentEntity>();
		List<StudentEntity> bkk = new ArrayList<StudentEntity>();
			transaction = session.beginTransaction();
			bk = session.createQuery("from StudentEntity").list();
			HibernateUtility.resourceCleanUp(session, transaction);
			for (Iterator<StudentEntity> iterator = bk.iterator(); iterator.hasNext();)
			{
				StudentEntity stent = iterator.next();
			if(stent.getActive().equalsIgnoreCase("y")){
				bkk.add(stent);
			}
			}
				//System.out.println("Sorry!! record not found!!");
				return bkk;
	}
}