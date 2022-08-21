package Mst;

import java.util.Scanner;

class Box{
	int width, height, depth;
	void Initilize(int w, int h, int d) {
		width= w;
		height= h;
		depth= d;
	}
	int getVolume() {
		return width*height*depth;
	}
}

public class mstQes1 {
	public static void main(String args[]) {
		Box B1= new Box();
		int x, y, z;
		System.out.print("ENter width, height, depth of Box: ");
		x= new Scanner(System.in).nextInt();
		y= new Scanner(System.in).nextInt();
		z= new Scanner(System.in).nextInt();
		B1.Initilize(x, y, z);
		
		int vol= B1.getVolume();
		System.out.println("Volume of Box of dimensionz "+ x+"X"+y+"X"+z+ " = "+ vol);
		
	}
}
