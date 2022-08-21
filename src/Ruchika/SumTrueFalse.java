package Ruchika;


// package Ruchika;

import java.util.Scanner;

class Hhelperrr{
	static int inputInt(String a) {
		System.out.println("Enter "+a+": ");
		return new Scanner(System.in).nextInt();
	}
}

public class SumTrueFalse {
	boolean twoAsOne(int a, int b, int c) {
		if((a+b==c) || (b+c== a) || (a+c == b)) {
			return true;
		}		
		return false;
	}
	
	public static void main(String args[]) {
		SumTrueFalse obj= new SumTrueFalse();
		boolean a= obj.twoAsOne(1, 2, 3);
		System.out.println(a);
		boolean b= obj.twoAsOne(3, 1, 2);
		System.out.println(b);
		boolean c= obj.twoAsOne(3, 2, 2);
		System.out.println(c);
	}
}
