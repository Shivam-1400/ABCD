package bhavy;

class functioss{
	static int sumFirstn(int n) {
		int sum= 0;
		for(int i=1; i<= n; i++) {
			sum= sum+ i;
		}
		return sum;
	}
	static int SumFirstNGap(int n) {
		n=n*2;
		int sum= 0;
		for(int i=1; i<= n; i= i+2) {
			sum= sum+ i;
		}
		return sum;
	}
}

public class Q2 {
	public static void main(String args[]) {
		int sum10= functioss.sumFirstn(10);
		System.out.println("Sum of first 10 natural numbers= "+ sum10);
		
		int sumGap= functioss.SumFirstNGap(10);
		System.out.println("Sum of first 10 numbers with a gap of one number= "+ sumGap);
	}
}
