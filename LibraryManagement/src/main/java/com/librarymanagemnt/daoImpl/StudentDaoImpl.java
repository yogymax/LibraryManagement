package com.librarymanagemnt.daoImpl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.librarymanagemnt.daointerfaces.StudentDao;
import com.librarymanagemnt.entitybeans.StudentEntity;
import com.librarymanagemnt.utilities.HibernateUtility;

public class StudentDaoImpl implements StudentDao {

	public void addStudent(StudentEntity stud) {
		
		Session session = HibernateUtility.getSessionFactory().openSession();
		Transaction ts = session.beginTransaction();
		session.persist(stud);
		ts.commit();
		session.flush();
		session.close();
		
	}

	public void updateStudent(int studId) {
		// TODO Auto-generated method stub
		
	}

	public void deleteStudent(int studId) {
		// TODO Auto-generated method stub
		
	}

	public StudentEntity getStudent(int studId) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<StudentEntity> getAllStudent() {
		// TODO Auto-generated method stub
		return null;
	}

}
