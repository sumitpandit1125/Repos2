package com.training;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class BookSerializer {
	
	public String serialize(Book obj){
		String message = null;
		ObjectOutputStream out = null;
		try{
			out = new ObjectOutputStream(
					new FileOutputStream(
							new File("Book.ser")));
			out.writeObject(obj);
			message = "One object serialzed - Press F5 to view the file";		}
		catch(IOException e){
			System.out.println(e.getMessage());
		}
		finally{
			try{
				out.close();
			}
			catch(IOException e) {
				e.printStackTrace();
			}
		}
		
		return message;
	}
	
	public Object deSerialize(){
		Object obj = null;
		
		 
		
		try(ObjectInputStream oin = new ObjectInputStream(
				new FileInputStream(
						new File("Book.ser")));){
			
			obj = oin.readObject();
			
		}
		catch(ClassNotFoundException | IOException e){
			e.printStackTrace();
		}
		return obj;
	}

}
