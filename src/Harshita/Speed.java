package Harshita;

import java.util.Scanner;

class helper{
	static float inoutFloat(String a) {
		System.out.print("Enter "+ a+": ");
		return new Scanner(System.in).nextFloat();
	}
}


public class Speed{

    public static void main(String[] args) {
		float timeSeconds;
		float mps,kph, mph;
		
		float distance = helper.inoutFloat("Distance in meters");
		float hr = helper.inoutFloat("hours");
		float min = helper.inoutFloat("minutes");
		float sec = helper.inoutFloat("seconds");

		timeSeconds = (hr*3600) + (min*60) + sec;
		mps = distance / timeSeconds;
		kph = ( distance/1000.0f ) / ( timeSeconds/3600.0f );
		mph = kph / 1.609f;

		System.out.println("Your speed in meters/second is "+mps);
		System.out.println("Your speed in km/h is "+kph);
		System.out.println("Your speed in miles/h is "+mph);
		
	}
}
