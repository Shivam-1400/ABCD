package Shivam802;

import java.util.Scanner;

class helperr{
	static int inputInt(String a) {
		System.out.print("Enter "+a+": ");
		return new Scanner(System.in).nextInt();
	}
}

public class QesSol {
	public static void main(String args[]) {
		int n= helperr.inputInt("number ");
		int count=1;
		int res= 0;
		for(int i=1; i<=n; i++) {
			if(count%2==0 || count==1 ) {
				System.out.print("+"+i);
				res= res+ i;
				count++;
			}
			else {
				System.out.print("-"+i);
				res= res- i;
				count++;
			}
			i++;
		}
		System.out.println("= "+ res);
	}
}
