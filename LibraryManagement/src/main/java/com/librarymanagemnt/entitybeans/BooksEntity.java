package com.librarymanagemnt.entitybeans;


import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table
public class BooksEntity {

	@Id
	@Column
	//@GeneratedValue(strategy=GenerationType.IDENTITY)
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
	
	@Column
	private String active;
	
	@ManyToOne(cascade=CascadeType.ALL)
	 @JoinTable(name="author_book", joinColumns=@JoinColumn(name="bookId"), inverseJoinColumns=@JoinColumn(name="autherId"))  
		//Author object
	private AuthorsEntity authors;
	
	//@Column
		//Student object
	@OneToMany(cascade=CascadeType.ALL,mappedBy="books")
	private List<StudentEntity> student;
	
	public AuthorsEntity getAuthors() {
		return authors;
	}

	public void setAuthors(AuthorsEntity ae) {
		this.authors = ae;
	}

	

	public List<StudentEntity> getStudent() {
		return student;
	}

	public void setStudent(List<StudentEntity> student) {
		this.student = student;
	}

	public String getActive() {
		return active;
	}


	public void setActive(String active) {
		this.active = active;
	}

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

	

	public BooksEntity() {
		super();
		
	}

	public BooksEntity(int bookId, String bookName, String pub_nm, String type, int quantity, float price,
			String active) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.pub_nm = pub_nm;
		this.type = type;
		this.quantity = quantity;
		this.price = price;
		this.active = active;
		//this.auther = auther;
	}
	
	@Override
	public String toString() {
		return "BooksEntity [bookId=" + bookId + ", bookName=" + bookName + ", pub_nm=" + pub_nm + ", type=" + type
				+ ", quantity=" + quantity + ", price=" + price + ", active=" + active + ", authors=" + authors +", student=" + student + " ] ";
	}
	
}
