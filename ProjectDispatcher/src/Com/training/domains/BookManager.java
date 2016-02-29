package Com.training.domains;

import java.util.HashMap;

import Com.training.entity.Book;

public class BookManager {
	
	
	public HashMap<Long,Book> bookList;
	
	
	public BookManager(){
		
		bookList = new HashMap<Long,Book>();
		
		Book book1 = new Book(25555, "Head First Java", "anonymous", 450.0);
		Book book2 = new Book(516458, "C in depth", "anonymous", 480.0);
		Book book3 = new Book(2145, "Data Structure", "Karumanchi", 350.0);
		Book book4 = new Book(255403555, "Unix", "anonymous", 470.0);
		
		bookList.put(8l, book1);
		bookList.put(6l, book2);
		bookList.put(4l, book3);
		bookList.put(9l, book4);
	}
	
	public HashMap<Long,Book> getAllBook(){
		
				
		return bookList;
	}

	
	public Book findBookById(long id){
		
		for(long key:bookList.keySet()){
			Book bk = bookList.get(key);
			if(bk.getBookNumber()==id)
				return bk;
		}
		return null;
	}
}
