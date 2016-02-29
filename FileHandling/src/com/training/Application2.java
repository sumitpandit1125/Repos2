package com.training;

public class Application2 {

	public static void main(String[] args) {
		 Book[] book = new Book[5];
		 book[0] = new Book(101, "ABC", "ABC", 1000);
		 book[1] = new Book(102, "DEF", "DEF", 1000);
		 book[2] = new Book(103, "GHI", "GHI", 1000);
		 book[3] = new Book(104, "JKL", "JKL", 1000);
		 book[4] = new Book(105, "MNO", "MNO", 1000);
		 
		 BookManager bM = new BookManager();
		 System.out.println(bM.addBooks(book));
		 bM.printBook(); 

	}

}
