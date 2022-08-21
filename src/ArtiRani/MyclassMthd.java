package ArtiRani;

import java.util.Scanner;

class Myexception extends Exception{
	public Myexception(String a) {
		super(a);
	}
}

class MyClass{
	void method1(){
		System.out.println("Inside method 1");
		try {
			method2();
		} catch (Myexception e) {
			e.printStackTrace();
		}
	}
	void method2() throws Myexception {
		System.out.println("Inside method 2");
		method3();
	}
	void method3() throws Myexception {
		System.out.println("Inside method 3");
		System.out.println("Enter your name: ");
		String name= new Scanner(System.in).nextLine();
		if(!name.equals("Arti Rani"))
			throw new Myexception("Only Arti Rani is allowd");
		
		System.out.println("Welcome Arti Rani");
	}
}

public class MyclassMthd {
	public static void main(String args[]) {
		MyClass obj= new MyClass();
		obj.method1();
	}
}
