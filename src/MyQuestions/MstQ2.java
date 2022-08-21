package MyQuestions;

import java.util.Scanner;

class Helper{
	static int intputInteger(String a) {
		System.out.print("Enter "+a+" :");
		return new Scanner(System.in).nextInt();
	}
	static void print(String a) {
		System.out.println(a);
	}
}

class Area{
	
	int length, breadth, area;
	public Area(int l, int breadth) {
		length= l;
		this.breadth= breadth;
	}
	int returnArea() {
		area= length* breadth;
		return area;
	}
}

public class MstQ2 {
	public static void main(String []a) {
		int l= Helper.intputInteger("length of rectangle");
		int b= Helper.intputInteger("breadth of rectangle");
		
		Area rect1= new Area(l, b);
		int area= rect1.returnArea();
		Helper.print("Area of rectangle with dimension "+ rect1.length+"X"+b+" is : "+ rect1.returnArea());
	}

}
