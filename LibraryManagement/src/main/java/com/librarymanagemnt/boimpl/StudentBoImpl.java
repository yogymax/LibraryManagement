package com.librarymanagemnt.boimpl;

import java.util.List;

import com.librarymanagemnt.beanclasses.StudentBean;
import com.librarymanagemnt.bointerfaces.StudentBo;
import com.librarymanagemnt.daoImpl.StudentDaoImpl;
import com.librarymanagemnt.daointerfaces.StudentDao;
import com.librarymanagemnt.entitybeans.StudentEntity;

public class StudentBoImpl implements StudentBo {

	StudentDao std = new StudentDaoImpl();
	//StudentBo stbo = new StudentBoImpl();
	public void addStudent(StudentBean stud) {
		
		StudentEntity stent= BeanToEntity(stud);
		std.addStudent(stent);
	
	}

	public void updateStudent(int studId) {
		// TODO Auto-generated method stub
		
	}

	public void deleteStudent(int studId) {
		// TODO Auto-generated method stub
		
	}

	public StudentBean getStudent(int studId) {
		
		return null;
	}

	public List<StudentBean> getAllStudent() {
		// TODO Auto-generated method stub
		return null;
	}

	public StudentBean EntityToBean(StudentEntity student) {
		StudentBean sb = new StudentBean();
		sb.setStud_Id(student.getStudId());
		sb.setStud_FName(student.getStudFNm());
		sb.setStud_LName(student.getStudLNm());
		sb.setStud_email(student.getEmail());
		sb.setGender(student.getGender());
		return sb;
	}

	public StudentEntity BeanToEntity(StudentBean studbean) {
		StudentEntity se = new StudentEntity();
		se.setStudId(studbean.getStud_Id());
		se.setStudFNm(studbean.getStud_FName());
		se.setStudLNm(studbean.getStud_LName());
		se.setEmail(studbean.getStud_email());
		se.setGender(studbean.getGender());
		return se;
	}

}
