package Paras;

abstract class Telephone{
	abstract void lift();
	abstract void disconnected();
}

class SmartTelephone extends Telephone {

	void lift() {
		System.out.println("Call is recieved");
	}

	void disconnected() {
		System.out.println("Call disconnectde");
	}
}

public class Solution {
	public static void main(String args[]) {
		Telephone obj= new SmartTelephone();
		obj.lift();
		obj.disconnected();
		
	}

}
