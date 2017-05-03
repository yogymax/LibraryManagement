package com.librarymanagemnt.beanclasses;

public class StudentBean {

	
	//studId
	private int stud_Id;
	//studFirstName
	private String stud_FName;
	//studLastName
	private String stud_LName;
	//email
	private String stud_email;
	//gender
	private String gender;
	//Department Object
	//Book Object
	public int getStud_Id() {
		return stud_Id;
	}
	public void setStud_Id(int stud_Id) {
		this.stud_Id = stud_Id;
	}
	public String getStud_FName() {
		return stud_FName;
	}
	public void setStud_FName(String stud_FName) {
		this.stud_FName = stud_FName;
	}
	public String getStud_LName() {
		return stud_LName;
	}
	public void setStud_LName(String stud_LName) {
		this.stud_LName = stud_LName;
	}
	public String getStud_email() {
		return stud_email;
	}
	public void setStud_email(String stud_email) {
		this.stud_email = stud_email;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public StudentBean(int stud_Id, String stud_FName, String stud_LName, String stud_email, String gender) {
		super();
		this.stud_Id = stud_Id;
		this.stud_FName = stud_FName;
		this.stud_LName = stud_LName;
		this.stud_email = stud_email;
		this.gender = gender;
	}
	public StudentBean() {
		super();
	}
	@Override
	public String toString() {
		return "Student [stud_Id=" + stud_Id + ", stud_FName=" + stud_FName + ", stud_LName=" + stud_LName
				+ ", stud_email=" + stud_email + ", gender=" + gender + "]";
	}
	
	
}
