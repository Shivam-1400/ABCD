package Harshita;

import java.util.Scanner;

class hellpeer{
	static String inputString(String a) {
		System.out.print("Enter "+a+": ");
		return new Scanner(System.in).nextLine();
	}
}

public class StringConcatenation {
	public static void main(String args[]) {
		String st1, st2;
		st1= hellpeer.inputString("First String");
		st2= hellpeer.inputString("Second String");
		
		String res= st1.concat(" "+st2);
		System.out.println("New String: "+ res);
	}
}





