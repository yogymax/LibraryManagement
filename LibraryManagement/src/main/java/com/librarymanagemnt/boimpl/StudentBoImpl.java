package com.librarymanagemnt.boimpl;

import java.util.ArrayList;
import java.util.List;

import com.librarymanagemnt.beanclasses.AuthorsBean;
import com.librarymanagemnt.beanclasses.BooksBean;
import com.librarymanagemnt.beanclasses.DepartmentBean;
import com.librarymanagemnt.beanclasses.StudentBean;
import com.librarymanagemnt.bointerfaces.StudentBo;
import com.librarymanagemnt.daoImpl.StudentDaoImpl;
import com.librarymanagemnt.daointerfaces.StudentDao;
import com.librarymanagemnt.entitybeans.AuthorsEntity;
import com.librarymanagemnt.entitybeans.BooksEntity;
import com.librarymanagemnt.entitybeans.DepartmentEntity;
import com.librarymanagemnt.entitybeans.StudentEntity;

public class StudentBoImpl implements StudentBo {

	StudentDao std = new StudentDaoImpl();
	
	StudentBean sb = new StudentBean();
	StudentEntity stent = new StudentEntity();
	
	List<StudentEntity> bbk = new ArrayList<StudentEntity>();
	List<StudentBean> bb = new ArrayList<StudentBean>();
	
	List<BooksBean> bbean = new ArrayList<BooksBean>();
	List<BooksEntity> bent = new ArrayList<BooksEntity>();
	
	BooksEntity be = new BooksEntity();
	BooksBean bkb = new BooksBean();
	
	DepartmentBean db = new DepartmentBean();
	DepartmentEntity dent = new DepartmentEntity();
	
	AuthorsBean abean = new AuthorsBean();
	AuthorsEntity aent = new AuthorsEntity();
	
	public void addStudent(StudentBean stud,BooksBean blist, DepartmentBean dbean, AuthorsBean ab) {
		
			stent= beanToEntity(stud);
			be = beanToEntity(blist);
			dent = beanToEntity(dbean);
			aent = beanToEntity(ab);
			std.addStudent(stent,be,dent,aent);
	
	}


	public AuthorsBean entityToBean(AuthorsEntity authent) {
		abean.setAutherId(authent.getAutherId());
		abean.setAutherName(authent.getAuthorName());
		return abean;
	}

	public AuthorsEntity beanToEntity(AuthorsBean authbean) {
		aent.setAutherId(authbean.getAutherId());
		aent.setAuthorName(authbean.getAutherName());
		return aent;
	}


	public DepartmentEntity beanToEntity(DepartmentBean dbean) {
		// TODO Auto-generated method stub
		dent.setDeptId(dbean.getDept_Id());
		dent.setDeptName(dbean.getDept_nm());
		
		return dent;
	}
	
	public DepartmentBean entityToBean(DepartmentEntity dent){
		db.setDept_Id(dent.getDeptId());
		db.setDept_nm(dent.getDeptName());
		return db;
	}

	public BooksEntity beanToEntity(BooksBean booksBean) {
		// TODO Auto-generated method stub
		be.setBookId(booksBean.getBook_Id());
		be.setBookName(booksBean.getBook_nm());
		be.setPub_nm(booksBean.getPub_nm());
		be.setType(booksBean.getType());
		be.setQuantity(booksBean.getQuanity());
		be.setPrice(booksBean.getPrice());
		be.setActive(booksBean.getActive());
		
		return be;
	}
	
public BooksBean entityToBean(BooksEntity bookent) {
		
		bkb.setBook_Id(bookent.getBookId());
		bkb.setBook_nm(bookent.getBookName());
		bkb.setPub_nm(bookent.getPub_nm());
		bkb.setType(bookent.getType());
		bkb.setQuanity(bookent.getQuantity());
		bkb.setPrice(bookent.getPrice());
		bkb.setActive(bookent.getActive());
		return bkb;
		
	}
	
	public void updateStudent(StudentBean stud) {
		stud.setStud_LName("Desai");
		stent= beanToEntity(stud);
		std.updateStudent(stent);
	}

	public void deleteStudent(StudentBean st1) {
		st1.setActive("N");
		stent = beanToEntity(st1);
		std.deleteStudent(stent);
		
		
	}

	public StudentBean getStudent(int studId) {
		
		stent = std.getStudent(studId);
		sb = entityToBean(stent);
			//System.out.println(sb);
		return sb;
	}

	public List<StudentBean> getAllStudent() {
		
		bbk=std.getAllStudent();
		
		for (StudentEntity stnt:bbk)
		{
			
			sb =  entityToBean(stnt);
			//System.out.println(sb);
			bb.add(sb);
		}
		return bb;
	}

	public StudentBean entityToBean(StudentEntity student) {
		
		sb.setStud_Id(student.getStudId());
		sb.setStud_FName(student.getStudFNm());
		sb.setStud_LName(student.getStudLNm());
		sb.setStud_email(student.getEmail());
		sb.setGender(student.getGender());
		sb.setActive(student.getActive());
		//sb.setDept(student.getDept());
		
		return sb;
	}

	public StudentEntity beanToEntity(StudentBean studbean) {
		
		stent.setStudId(studbean.getStud_Id());
		stent.setStudFNm(studbean.getStud_FName());
		stent.setStudLNm(studbean.getStud_LName());
		stent.setEmail(studbean.getStud_email());
		stent.setGender(studbean.getGender());
		stent.setActive(studbean.getActive());
		//stent.setDept(studbean.getDept());
		return stent;
	}

	/*public void addStudent(StudentBean stud) {
		// TODO Auto-generated method stub
		
	}*/

}
