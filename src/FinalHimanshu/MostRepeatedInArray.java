package FinalHimanshu;

import java.util.Scanner;

class Ar{
	int val, count;
}

public class MostRepeatedInArray {
	public static void main(String args[]) {
		Scanner cin= new Scanner(System.in);
		System.out.println("Enter number of elements in array: ");
		int n= cin.nextInt();
		Ar []A= new Ar[n];
		
		for(int i=0; i< A.length; i++) {
			A[i]= new Ar();
			System.out.print("enter A["+i+"]: ");
			A[i].val= cin.nextInt();
		}
		
		for(int i=0; i< n; i++) {
			
			for(int j=0; j< n; j++) {
				if(A[i].val== A[j].val) {
					A[i].count++;
				}
			}
		}
		int max= A[0].count;
		int index= 0;
		for(int i=0; i< n; i++) {
			if(max< A[i].count) {
				max= A[i].count;
				index= i;
			}
		}
		System.out.println(A[index].val+" occurred "+ A[index].count);
	}

}
//10,20,10,30,40,100,99