package Yuvraj;

import java.util.Scanner;

class helperr2{
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

public class Q2 {
	public static void main(String args[]) {
		int a= helperr2.inputInt("number");
		if(a%3==0 && a%5==0) {
			helperr2.print("FizzBuzz!");
		}
		else if(a%3==0) {
			helperr2.print("Fizz!");
		}
		else if(a%5==0) {
			helperr2.print("Buzz!");
		}
		else {
			helperr2.print(a+"!");
		}
	}

}
