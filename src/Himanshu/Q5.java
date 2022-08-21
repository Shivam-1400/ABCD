package Himanshu;

import java.util.Scanner;

class Answer{
	static int printRev(int a) {
		int temp, num=0;
		while(a !=0) {
			temp= a%10;
			num= num*10 + temp;
			a= a/10;
		}
		return num;
	}
}

public class Q5 {
	public static void main(String args[]) {
		System.out.print("Enter a:");
		int a= new Scanner(System.in).nextInt();
		System.out.print("Enter b:");
		int b= new Scanner(System.in).nextInt();
		
		if(a== b) {
			System.out.print(Answer.printRev(a));
		}
		else {
			int temp =a;
			a= b;
			b= temp;
			System.out.print("After swapping \na=" + a+"\nb="+ b);
			
		}
	}

}
