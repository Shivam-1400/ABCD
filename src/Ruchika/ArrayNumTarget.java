package Ruchika;

import java.util.Scanner;

class helperrr{
	static int intputInt(String a) {
		System.out.print("Enter "+ a+": ");
		return new Scanner(System.in).nextInt();
	}
}

public class ArrayNumTarget {
	public static void main(String args[]) {
		int n= helperrr.intputInt("size of array");
		int A[]= new int[n];
		for(int i=0; i< A.length; i++) {
			A[i]= helperrr.intputInt("A["+i+"]");
		}
		int target= helperrr.intputInt("target");
		for(int i=0; i< A.length; i++) {
			for(int j=0; j< A.length; j++) {
				if(A[i]+ A[j] == target) {
					System.out.println("["+i+", "+j+"]");
					return;
				}
			}
		}
	}
}
