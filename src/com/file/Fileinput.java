package com.file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Fileinput {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		
   FileInputStream fis=null;
     try {
		fis=new FileInputStream("C:\\Users\\ganap\\workspace\\Day7\\src\\com\\file\\ Fileinput.java");
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
    
     try {
    	 int i;
		while((i=fis.read())!=-1)
		 {
			 System.out.print((char)i);
		 }
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
	

}
