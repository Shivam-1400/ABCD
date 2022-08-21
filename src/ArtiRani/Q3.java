package ArtiRani;

import ArtiRani.Colour.Red;
import ArtiRani.Colour.Yellow;

class Colour{
	String into="In colour class";
	
	public class Red{
		String info="Inside Red class";
		Red(){
			System.out.println(info);
		}
	}
	static class Yellow{
		String info="Inside yellow class";
		Yellow(){
			System.out.println(info);
		}
	}
}

public class Q3 {
	public static void main(String args[]) {
		Colour Cobj= new Colour();
		
		Red r1= new Colour().new Red();
		
		
		Yellow y1=new Yellow();
	}
}
