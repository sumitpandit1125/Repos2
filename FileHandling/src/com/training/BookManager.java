package com.training;

import java.io.*;

public class BookManager {
	
	public String addBooks(Book[] bks){
		
		try(PrintWriter write = new PrintWriter(new FileWriter(("Book2.dat"), true));){
			
			for (int i = 0; i < bks.length;i++){
				
				write.print(bks[i]+"\n");
			}
		}
		catch(IOException e){
			System.out.println(e.getMessage());
		}
		
		return "Books Added";
	}
	
	
	public void printBook(){
		
		
		try(BufferedReader read = new BufferedReader(new FileReader(new File("Book2.dat")));){
			String line = null;
			try{
				while((line = read.readLine()) != null){
					System.out.println(line);
				}
			}
			catch(IOException e){
				System.out.println(e.getMessage());

			}
		}
		catch(IOException e){
			System.out.println(e.getMessage());

		}
		
	}

}
