package Yuvraj;

import java.util.Scanner;

class helper{
	static int inputInt(String aa) {
		print("Enter "+aa +": ");;
		return new Scanner(System.in).nextInt();		
	}
	static void print(String msg) {
		System.out.print(msg);
	}
	static int reverse(int a) {
		int temp=0, rev=0;
		while(a!=0) {
			temp= a%10;
			rev= rev*10+ temp;
			a=a/10;
		}
		return rev;
	}
}
public class Q1 {
	public static void main(String args[]) {
		int a= helper.inputInt("number a");
		int b= helper.inputInt("number b");
		
		if(a==b) {
			helper.print("Reverse of number="+ helper.reverse(a));
		}
		else {
			int temp= a;
			a=b;
			b= temp;
			helper.print("After swapping: \na= "+ a+"\nb= "+b);
		}
	}
}
