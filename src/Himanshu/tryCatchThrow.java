package Himanshu;

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
class NameException extends Exception{
	public NameException() {
		super("This user not allowed. Only Himanshu is allowed");
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
		
		String Name= helperr.inputString("name");
		String Name2= "himanshu";
		try {
			if(!Name.equalsIgnoreCase(Name2)){
		        throw new NameException();
		    }
			System.out.println("Welcome Himanshu");
		}
		catch(NameException obj) {
			System.out.println(obj.getMessage());
		      obj.printStackTrace();
		}
	}
}
