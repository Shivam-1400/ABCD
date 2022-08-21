package Satyam;

import java.util.Scanner;

public class ODD {
	public static void main(String args[]) {
		Scanner cin= new Scanner(System.in);
		int a= cin.nextInt();
		int b= cin.nextInt();
		int c= cin.nextInt();
		int d= cin.nextInt();
		int e= cin.nextInt();
		
		odd(a);
		odd(a, b);
		odd(a, b, c);
		odd(a, b, c, d);
		odd(a, b, c, d, e);
		
		cin.close();
	}
	
	static void odd(int a) {
		if(checkOdd(a)) {
			System.out.print(a);
		}System.out.println();
	}
	static void odd(int a, int b) {
		if(checkOdd(a)) {
			System.out.print(a+" ");
		}
		if(checkOdd(b)) {
			System.out.print(b);
		}System.out.println();		
	}
	static void odd(int a, int b, int c) {
		if(checkOdd(a)) {
			System.out.print(a+" ");
		}
		if(checkOdd(b)) {
			System.out.print(b+" ");
		}
		if(checkOdd(c)) {
			System.out.print(c+" ");
		}System.out.println();
	}
	static void odd(int a, int b, int c, int d) {
		if(checkOdd(a)) {
			System.out.print(a+" ");
		}
		if(checkOdd(b)) {
			System.out.print(b+" ");
		}
		if(checkOdd(c)) {
			System.out.print(c+" ");
		}
		if(checkOdd(d)) {
			System.out.print(d+" ");
		}System.out.println();
	}
	static void odd(int a, int b, int c, int d, int e) {
		if(checkOdd(a)) {
			System.out.print(a+" ");
		}
		if(checkOdd(b)) {
			System.out.print(b+" ");
		}
		if(checkOdd(c)) {
			System.out.print(c+" ");
		}
		if(checkOdd(d)) {
			System.out.print(d+" ");
		}
		if(checkOdd(e)) {
			System.out.print(e+" ");
		}System.out.println();
	}
	
	static boolean checkOdd(int a) {
		if(a%2 !=0)
			return true;
		
		else
			return false;
	}
}
