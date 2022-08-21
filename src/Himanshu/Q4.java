package Himanshu;

import java.util.Scanner;

public class Q4 {
	public static void main(String args[]) {
		Scanner cin= new Scanner(System.in);
		String str= cin.nextLine();
		boolean ans= false;
		for(int i=0; i< str.length(); i++) {
			if(str.charAt(i) >='0' && str.charAt(i)<='9'){
				ans= true;
			}
		}
		System.out.print(ans);
		cin.close();
	}
}
