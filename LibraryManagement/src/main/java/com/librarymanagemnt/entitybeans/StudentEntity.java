package com.librarymanagemnt.entitybeans;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * @author JARVIS
 *
 */
@Entity
@Table
public class StudentEntity {

	@Id
	@Column
	//studId
	private int studId;
	
	@Column
		//studFirstName
	private String studFNm;
	@Column
	//studLastName
	private String studLNm;
	@Column
	private String email;
	@Column
	private String active;
	
	
	public String getActive() {
		return active;
	}
	public void setActive(String active) {
		this.active = active;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Column
		//gender
	private String gender;
	
	@ManyToOne(cascade=CascadeType.ALL)
	 @JoinTable(name="stud_book", joinColumns=@JoinColumn(name="studID"), inverseJoinColumns=@JoinColumn(name="bookId"))  
	private BooksEntity books;
		//Department Object
	@ManyToOne(cascade=CascadeType.ALL)
	 @JoinTable(name="stud_dept", joinColumns=@JoinColumn(name="studID"), inverseJoinColumns=@JoinColumn(name="deptId"))  
	private DepartmentEntity dept;
	
	//Book Object
	public int getStudId() {
		return studId;
	}
	
	public BooksEntity getBooks() {
		return books;
	}
	public void setBooks(BooksEntity books) {
		this.books = books;
	}
	public DepartmentEntity getDept() {
		return dept;
	}
	public void setDept(DepartmentEntity dept) {
		this.dept = dept;
	}
	public void setStudId(int studId) {
		this.studId = studId;
	}
	public String getStudFNm() {
		return studFNm;
	}
	public void setStudFNm(String studFNm) {
		this.studFNm = studFNm;
	}
	public String getStudLNm() {
		return studLNm;
	}
	public void setStudLNm(String studLNm) {
		this.studLNm = studLNm;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public StudentEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public StudentEntity(int studId, String studFNm, String studLNm, String email, String active, String gender) {
		super();
		this.studId = studId;
		this.studFNm = studFNm;
		this.studLNm = studLNm;
		this.email = email;
		this.active = active;
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "StudentEntity [studId=" + studId + ", studFNm=" + studFNm + ", studLNm=" + studLNm + ", email=" + email
				+ ", active=" + active + ", gender=" + gender + ", books=" + books + ", dept=" + dept + "]";
	}
	
	

	
	
}
