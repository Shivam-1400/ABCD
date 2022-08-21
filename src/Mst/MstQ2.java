/*
 * Write a program that accepts 2 integers a and b as input and finds the quotient of a/b.
This program may generate an Arithmetic Exception. Use exception handling mechanisms to handle this exception. In the catch block, print the message as shown in the sample output.
Also illustrate the use of finally block. Print the message “Inside finally block”.
Sample Input and Output 1:
Enter the 2 numbers
5
2
The quotient of 5/2 = 2
Inside finally block

Sample Input and Output 2:
Enter the 2 numbers
5
DivideByZeroException caught
Inside finally block
*/

package Mst;

import java.util.Scanner;

class helper{
	static int intInput(String a) {
		System.out.print("Enter "+ a+ ": ");
		int z= new Scanner(System.in).nextInt();
		return z;
	}
}

public class MstQ2 {
	public static void main(String args[]) {
		int a, b, c;
		a= helper.intInput("Number 1");
		b= helper.intInput("Number 2");
		
		try {
			c= a/b;
			System.out.println("The quotient of "+ a+"/"+ b+ "= "+ c);
		}catch (ArithmeticException e) {
			System.out.println("DivideByZeroException caught");
		}
		finally {
			System.out.println("Inside finally block");
		}
	}
}
