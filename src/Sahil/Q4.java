package Sahil;

import java.util.Scanner;

public class Q4 {
	public static void main(String args[])  {
		Scanner cin= new Scanner(System.in);
		int A[]=new int[256];
		for(int i=0; i< 256; i++)
			A[i]=0;
		
		System.out.print("Enter number of words: ");
		int n= cin.nextInt();
		String s;
		char[] a;
		for(int i=0; i< n; i++) {
			System.out.print("Enter word "+i+": ");
			a= cin.next().toCharArray();
			for(int j=0; a[j] !='\0'; j++) {
				int x= a[j];
				A[x]++;
			}
		}
		for(int i=0; i< n; i++) {
			if(A[i]== n) {
				System.out.println((char)i+ " ");
			}
		}
	}

}
