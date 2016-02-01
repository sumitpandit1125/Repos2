package com.Inheritance;

public class Book extends Media{
	
	private String author;
	private String isbn;
	private int edition;
	
	public Book(String name, int lendingLength, String author, String isbn, int edition) {
		super(name, lendingLength);
		this.author = author;
		this.isbn = isbn;
		this.edition = edition;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public int getEdition() {
		return edition;
	}

	public void setEdition(int edition) {
		this.edition = edition;
	}
	
	@Override
	public void printMedia(){
		super.printMedia();
		System.out.println("Author :"+author);
		System.out.println("ISBN :"+isbn);
		System.out.println("Edition :"+edition);
	}

}
