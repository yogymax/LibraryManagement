package com.librarymanagemnt.entitybeans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class AuthorsEntity {

	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	//authorId
	private int autherId;
		//authorName
	@Column
	private String authorName;
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
	
}
