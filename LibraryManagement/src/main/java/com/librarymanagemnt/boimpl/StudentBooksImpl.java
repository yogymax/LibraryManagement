package com.librarymanagemnt.boimpl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.librarymanagemnt.beanclasses.AuthorsBean;
import com.librarymanagemnt.beanclasses.BooksBean;
import com.librarymanagemnt.bointerfaces.BooksBo;
import com.librarymanagemnt.daoImpl.BooksDaoImpl;
import com.librarymanagemnt.daointerfaces.BooksDao;
import com.librarymanagemnt.entitybeans.AuthorsEntity;
import com.librarymanagemnt.entitybeans.BooksEntity;

public class StudentBooksImpl implements BooksBo {

	BooksDao stdao = new BooksDaoImpl();
	BooksEntity bent=new BooksEntity();
	BooksBean bb=new BooksBean();
	AuthorsBean ab = new AuthorsBean();
	AuthorsEntity ae = new AuthorsEntity();
	public void addBook(BooksBean book, AuthorsBean ab) {
		 bent= BeanToEntity(book);
		ae = BeanToEntity(ab);
		stdao.addBook(bent,ae);
	}

	public void updateBook(BooksBean book) {
		book.setBook_nm("ANSI JAVA");
		bent = BeanToEntity(book);
		stdao.updateBook(bent);
	}

	public void deleteBook(BooksBean book) {
		
		book.setActive("N");
		bent = BeanToEntity(book);
		stdao.deleteBook(bent);
	}

	public BooksBean getBook(int bookId) {
		 bent = stdao.getBook(bookId);
		 bb = EntityToBean(bent);
			//System.out.println(sb);
		return bb;
	}

	public List<BooksBean> listofbooks() {
	
		List<BooksEntity> bbk = stdao.listofbooks();
		
		List<BooksBean> bb1=new ArrayList<BooksBean>();
		for (Iterator<BooksEntity> iterator = bbk.iterator(); iterator.hasNext();)
		{
			bent = iterator.next();
			 bb =  EntityToBean(bent);
				//System.out.println(bo);
			bb1.add(bb);
		}
		return bb1;
	}

	public BooksBean EntityToBean(BooksEntity bookent) {
		
		bb.setBook_Id(bookent.getBookId());
		bb.setBook_nm(bookent.getBookName());
		bb.setPub_nm(bookent.getPub_nm());
		bb.setType(bookent.getType());
		bb.setQuanity(bookent.getQuantity());
		bb.setPrice(bookent.getPrice());
		bb.setActive(bookent.getActive());
		return bb;
		
	}

	public BooksEntity BeanToEntity(BooksBean bookbean) {
		
		bent.setBookId(bookbean.getBook_Id());
		bent.setBookName(bookbean.getBook_nm());
		bent.setPub_nm(bookbean.getPub_nm());
		bent.setType(bookbean.getType());
		bent.setQuantity(bookbean.getQuanity());
		bent.setPrice(bookbean.getPrice());
		bent.setActive(bookbean.getActive());
		return bent;
	}

	

	public AuthorsBean EntityToBean(AuthorsEntity authent) {
		ab.setAutherId(authent.getAutherId());
		ab.setAutherName(authent.getAuthorName());
		return ab;
	}

	public AuthorsEntity BeanToEntity(AuthorsBean authbean) {
		ae.setAutherId(authbean.getAutherId());
		ae.setAuthorName(authbean.getAutherName());
		return ae;
	}

	

}
