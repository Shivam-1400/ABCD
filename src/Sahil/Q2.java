package Sahil;

import java.util.Scanner;

public class Q2 {
	static int climbStairs(int n) {       
        int last1 = 1, last2 = 0, result = 0;
        for(int i = 0; i < n; i++){     
            result = last1 + last2;
            last2 = last1;
            last1 = result;
        }      
        return result;
    }
	public static void main(String args[]) {
		System.out.print("Enter number of stairs: ");
		int n= new Scanner(System.in).nextInt();
		int res= Q2.climbStairs(n);
		System.out.println("NUmber of ways to climb stairs= "+res);
	}
}