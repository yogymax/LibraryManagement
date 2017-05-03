package com.librarymanagemnt.beanclasses;

public class BooksBean {
//bookId
	private int book_Id;
	
	//bookName
	private String book_nm;
	
	//publication
	private String pub_nm;
	//type
	private String type;
	//quantity
	private int quanity;
	//price
	private float price;
	//Author object
	//private Authors auther;
	//Student object
	//private Student student;
	public int getBook_Id() {
		return book_Id;
	}
	public void setBook_Id(int book_Id) {
		this.book_Id = book_Id;
	}
	public String getBook_nm() {
		return book_nm;
	}
	public void setBook_nm(String book_nm) {
		this.book_nm = book_nm;
	}
	public String getPub_nm() {
		return pub_nm;
	}
	public void setPub_nm(String pub_nm) {
		this.pub_nm = pub_nm;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getQuanity() {
		return quanity;
	}
	public void setQuanity(int quanity) {
		this.quanity = quanity;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	
	public BooksBean(int book_Id, String book_nm, String pub_nm, String type, int quanity, float price) {
		super();
		this.book_Id = book_Id;
		this.book_nm = book_nm;
		this.pub_nm = pub_nm;
		this.type = type;
		this.quanity = quanity;
		this.price = price;
	}
	public BooksBean() {
		super();
		
	}
	
	
}
