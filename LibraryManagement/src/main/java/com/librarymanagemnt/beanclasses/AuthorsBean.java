package com.librarymanagemnt.beanclasses;

public class AuthorsBean {

	
	//authorId
	private int autherId;
	
	//authorName
	private String autherName;

	public int getAutherId() {
		return autherId;
	}

	public void setAutherId(int autherId) {
		this.autherId = autherId;
	}

	public String getAutherName() {
		return autherName;
	}

	public void setAutherName(String autherName) {
		this.autherName = autherName;
	}

	public AuthorsBean(int autherId, String autherName) {
		super();
		this.autherId = autherId;
		this.autherName = autherName;
	}

	public AuthorsBean() {
		super();
		
	}
	
	
}
