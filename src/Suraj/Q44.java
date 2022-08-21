package Suraj;

import java.io.*;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;
public class Q44 {
	
	public static void main(String args[]) throws Exception{
	    try{
	    	fileCopy();
		}
		catch(Exception e){ System.out.println(e);}
	}
	static void fileCopy() throws Exception{
		Scanner cin= new Scanner(System.in);
		
	  File src= new File("C:\\Users\\Dell\\Dropbox\\PC\\Documents\\Padhai Likhai\\Worksheets\\DBMS\\JAVA LAB MST 1.docx");
	  File des= new File("C:\\Users\\Dell\\Dropbox\\PC\\Documents\\JAVA LAB MST 1.docx");
	  
	  FileInputStream fis= new FileInputStream(src);
	  FileOutputStream fos= new FileOutputStream(des);
	  
	  int bt, count=0;
	  while(true){
	    bt= fis.read();
	    
	    if(bt== -1){
	      break;
			}		
			fos.write(bt);  
			count++;
		}		
		fis.close();
		fos.close();
		System.out.println("File copied Successfully");
		System.out.println(des.getAbsolutePath()+": size "+count+" bytes");
	}
	
}