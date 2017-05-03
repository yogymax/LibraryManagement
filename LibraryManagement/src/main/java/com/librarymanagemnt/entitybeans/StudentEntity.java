package com.librarymanagemnt.entitybeans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

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
	
	public StudentEntity(int studId, String studFNm, String studLNm, String email, String gender) {
		super();
		this.studId = studId;
		this.studFNm = studFNm;
		this.studLNm = studLNm;
		this.email = email;
		this.gender = gender;
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
	
		//Department Object
		//Book Object
	public int getStudId() {
		return studId;
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
	public StudentEntity(int studId, String studFNm, String studLNm, String gender) {
		super();
		this.studId = studId;
		this.studFNm = studFNm;
		this.studLNm = studLNm;
		this.gender = gender;
	}
	public StudentEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Student [studId=" + studId + ", studFNm=" + studFNm + ", studLNm=" + studLNm + ", email=" + email
				+ ", gender=" + gender + "]";
	}

	
}
