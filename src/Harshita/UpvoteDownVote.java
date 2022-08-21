package Harshita;

import java.util.Scanner;

class helprr{
	static int inputInt(String a) {
		System.out.print("Enter "+a+": ");
		return new Scanner(System.in).nextInt();
	}
}

public class UpvoteDownVote {
	static int getVoteCount(int a, int b) {
		return b-a;
	}
	public static void main(String args[]) {
		int t= helprr.inputInt("number of testcases");
		while(t !=0) {
			int upV= helprr.inputInt("number of upvotes");
			int dnV= helprr.inputInt("number of downvotes");
			int res= UpvoteDownVote.getVoteCount(upV, dnV);
			System.out.println("Result= "+ res+"\n");
			t--;
		}
		
	}
}



