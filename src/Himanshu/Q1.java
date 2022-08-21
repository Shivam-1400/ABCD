package Himanshu;

import java.util.Scanner;

class Input{
	static int inputInt() {
		return new Scanner(System.in).nextInt();
	}
	static float inputFLoat() {
		return new Scanner(System.in).nextFloat();
	}
	static String inputString() {
		return new Scanner(System.in).nextLine();
	}
}

public class Q1 {
	public static void main(String args[]) {
		String a= Input.inputString();
		int b= Input.inputInt();
		float c= Input.inputFLoat();
		
		System.out.println(a+"\n"+b+"\n"+c);
	}

}
