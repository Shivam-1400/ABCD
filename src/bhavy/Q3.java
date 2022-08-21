package bhavy;

import java.util.Scanner;

class helperr{
	static String inputStrint(String a) {
		System.out.print("Enter "+a+": ");
		return new Scanner(System.in).nextLine();
	}
}

public class Q3 {
	public static void main(String args[]) {
		String name= helperr.inputStrint("name");
		String []name1= name.split(" ");
		System.out.println(name1[1]+", "+ name1[0]);
				
	}
}
