package com.training.entity;

import org.springframework.stereotype.Component;

@Component("book")
public class Book {
	
	private int bookNumber;
	private String bookName;
	private String subject;
	
	private Isbn code;
	
	public Isbn getCode() {
		return code;
	}
	public void setCode(Isbn code) {
		this.code = code;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Book(int bookNumber, String bookName) {
		super();
		this.bookNumber = bookNumber;
		this.bookName = bookName;
	}
	public int getBookNumber() {
		return bookNumber;
	}
	public void setBookNumber(int bookNumber) {
		this.bookNumber = bookNumber;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	@Override
	public String toString() {
		return "Book [bookNumber=" + bookNumber + ", bookName=" + bookName + "]";
	}
	
	

}
