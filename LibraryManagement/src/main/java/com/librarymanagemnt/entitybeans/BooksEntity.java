package com.librarymanagemnt.entitybeans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class BooksEntity {

	@Id
	@Column
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	//bookId
	private int bookId;
	@Column
		//bookName
	private String bookName;
	@Column
	//publication
	private String pub_nm;
	
	@Column
		//type
	private String type;
	
	@Column
	//quantity
	private int quantity;

	@Column
	//price
	private float price;
	
	/*@Column
		//Author object
	private AuthorsEntity auther;
	
	@Column
		//Student object
	private StudentEntity student;*/

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
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

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	/*public AuthorsEntity getAuther() {
		return auther;
	}

	public void setAuther(AuthorsEntity auther) {
		this.auther = auther;
	}

	public StudentEntity getStudent() {
		return student;
	}

	public void setStudent(StudentEntity student) {
		this.student = student;
	}
*/
	public BooksEntity(int bookId, String bookName, String pub_nm, String type, int quantity, float price) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.pub_nm = pub_nm;
		this.type = type;
		this.quantity = quantity;
		this.price = price;
		/*this.auther = auther;
		this.student = student;*/
	}

	public BooksEntity() {
		super();
		
	}
	
	
}
