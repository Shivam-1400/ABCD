package Gauransh;

import java.util.Scanner;

class helperAA{
	static int inputInt(String a) {
		System.out.print("Enter "+a+": ");
		return new Scanner(System.in).nextInt();
	}
	static float inputFloatt(String a) {
		System.out.print("Enter "+a+": ");
		return new Scanner(System.in).nextFloat();
	}
}

public class AverageArray {
	public static void main(String args[]) {
		int n= helperAA.inputInt("size of array");
		float A[]= new float[n];
		float sum=0;
		for(int i=0; i< n; i++) {
			A[i]= helperAA.inputFloatt("A["+i+"]");
			sum= sum+ A[i];
		}
		System.out.println("Showing percentage");
		for(int i=0; i< n; i++) {
			System.out.println("A["+i+"]= "+ A[i]+"\tPercentage= "+ (A[i]*100)/sum);
		}
	}
}
