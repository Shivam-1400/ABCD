package ArtiRani;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Q2 {
	public static void main(String args[]){
		int num;
		Scanner s = new Scanner(System.in);
		System.out.print("Input a number.");

		try{ // try catch should surround s.nextInt, too
		num = s.nextInt(); // read the input
		if( num <0){
		throw new InputMismatchException("Only Positive Numbers!");
		}


		int square = num * num;

		System.out.println("Square: " + square);

		}catch (InputMismatchException e){

		System.out.println("invalid input! " + e.getMessage()); // catch the exception and print its message (e.g. "Only Positive Numbers!" when a negative number is entered)

		}

		}
}
