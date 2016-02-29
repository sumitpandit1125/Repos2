package com.training;

public class Application {

	public static void main(String[] args) {
	
		Book book = new Book(101, "book1", "sumit", 1000);
		
		BookSerializer bookSer = new BookSerializer();
		
		System.out.println(bookSer.serialize(book));
		book = (Book) bookSer.deSerialize();
		System.out.println(book.getBookNumber()+book.getBookName()+book.getAuthor()+book.getPrice());
		
	}

}
