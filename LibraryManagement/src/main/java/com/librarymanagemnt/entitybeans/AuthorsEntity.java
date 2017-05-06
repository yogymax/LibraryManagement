package com.librarymanagemnt.entitybeans;

import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table
public class AuthorsEntity {

	@Id
	@Column
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	//authorId
	private int autherId;
		//authorName
	@Column
	private String authorName;
	
	@OneToMany(cascade=CascadeType.ALL,mappedBy="authors")
	 private Set<BooksEntity> books;	
	public Set<BooksEntity> getBooks() {
		return books;
	}
	public void setBooks(Set<BooksEntity> books) {
		this.books = books;
	}
	public int getAutherId() {
		return autherId;
	}
	public void setAutherId(int autherId) {
		this.autherId = autherId;
	}
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	public AuthorsEntity(int autherId, String authorName) {
		super();
		this.autherId = autherId;
		this.authorName = authorName;
	}
	public AuthorsEntity() {
		super();
	
	}
	
	@Override
	public String toString() {
		return "AuthorsEntity [autherId=" + autherId + ", authorName=" + authorName + ", Books=" + books + "]";
	}

	
}
