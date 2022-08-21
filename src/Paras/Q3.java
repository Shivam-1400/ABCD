package Paras;

import java.util.Scanner;

class Q3helper{
	static int inputInt(String aa) {
		print("Enter "+aa +": ");;
		return new Scanner(System.in).nextInt();		
	}
	static void print(String msg) {
		System.out.print(msg);
	}
}

public class Q3 {
	public static void main(String args[]) {
		int a= Q3helper.inputInt("Number 1");
		String b= Integer.toBinaryString(~a);
		Q3helper.print("\n"+a+"\t: "+ Integer.toBinaryString(a));
		Q3helper.print("\n~"+a+"\t: "+ Integer.toBinaryString(~a).substring(28));
		Q3helper.print("\n~"+a+"= "+ Integer.reverse(Integer.parseInt(Integer.toBinaryString(~a).substring(28))));
	}
}
