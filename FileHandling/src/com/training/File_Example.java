package com.training;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;


public class File_Example {
	
	static int tab = 0;
	public static void main(String[] args) {
		
		File f = new File("Sample.txt");
		try {
			f.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			PrintWriter writer = new PrintWriter(f);
			writer.println("Hello");
			writer.close();
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}	
		File f1 = new File(".");
		dirPrint(f1);
		
		
		
		
		//System.out.println(f.exists());
		
		
	}

	public static void dirPrint(File f2){
		
		File[] files = f2.listFiles();
		
		for(File str:files){
			for(int i = 0; i<tab;i++){
				System.out.print("  ");
			}
			
			System.out.println(str.getName());
			if(str.isDirectory()){
				tab++;
				dirPrint(str);
				
			}
			
			
			
		}
		
	}

}
