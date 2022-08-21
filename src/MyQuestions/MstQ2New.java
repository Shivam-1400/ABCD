package MyQuestions;

import java.util.Scanner;

class Helperrr{
	static int intputInteger(String a) {
		System.out.print("Enter "+a+" :");
		return new Scanner(System.in).nextInt();
	}
	static void print(String a) {
		System.out.println(a);
	}
}

class Arrayy{
	static void fillArray(int aRef[]) {
		for(int i=0; i< aRef.length; i++) {
			aRef[i]= Helperrr.intputInteger("Array["+i+"]");
		}
	}
	static void showArray(int []aRef) {
		for(int i=0; i< aRef.length; i++) {
			System.out.print(aRef[i]+" ");
		}
		Helperrr.print("\n");
	}
	static int[] mergeArray(int[] aRef,int bRef[]){
		int c[]= new int[aRef.length];

		for(int i=0; i< aRef.length; i++) {
			for(int j=0; j< bRef.length; j++) {
				if(aRef[i]== bRef[j]) {
					c[i]= aRef[i];
				}
			}
		}
		return c;
	}
	static int sumElemnts(int aRef[]) {
		int sum=0;
		for(int i=0; i< aRef.length; i++) {
			sum= sum+ aRef[i];
		}
		return sum;
	}
}

public class MstQ2New {
	public static void main(String ar[]) {
		Helperrr.print("Array 1");
		int a[]= new int [4];
		Arrayy.fillArray(a);
		Helperrr.print("\nArray 2");
		int b[]= new int [4];
		Arrayy.fillArray(b);
		
		int c[]= Arrayy.mergeArray(a, b);
		Arrayy.showArray(c);
		int sum= Arrayy.sumElemnts(c);
		Helperrr.print(sum+" ");
	}
}
