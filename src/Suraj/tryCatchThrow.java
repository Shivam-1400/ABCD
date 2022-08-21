package Suraj;

import java.util.Scanner;


class helperr{
	static int inputInt(String a) {
		System.out.print("Enter "+a+": ");
		return new Scanner(System.in).nextInt();
	}
	static String inputString(String a) {
		System.out.print("Enter "+a+": ");
		return new Scanner(System.in).nextLine();
	}
}
class UIDException extends Exception{
	public UIDException() {
		super("UID not allowed. Only 20BCS9698 allowed");
	}
}

public class tryCatchThrow {
	public static void main(String args[]) throws ArrayIndexOutOfBoundsException{
		int a= helperr.inputInt("number 1");
		int b= helperr.inputInt("number 2");
		try {
			int c=a/b;
			System.out.println(a+"/"+b+"= "+c);
		}
		catch (ArithmeticException e) {
			e.printStackTrace();
		}
		
		System.out.println("division completed\n\n");
		
		String UID= helperr.inputString("enter UID");
		String UID2= "20BCS9698";
		try {
			if(!UID.equalsIgnoreCase(UID2)){
		        throw new UIDException();
		    }
			System.out.println("Welcome 20BCS9698");
		}
		catch(UIDException obj) {
			System.out.println(obj.getMessage());
		      obj.printStackTrace();
		}
	}
}
