package ArtiRani;

import java.util.Scanner;

class Student{
	int roll, std;
	String name;
	Student(){		
	}
	Student(int roll, String name, int std){
		this.roll= roll;
		this.name= name;
		this.std= std;
	}
	void showDetails() {
		System.out.println("\nRoll no.: "+ roll+ "\nName: "+ name+"\nStandard: "+ std);
	}
}
class Result extends Student{
	float marks1, marks2, marks3;
	Result(){}
	Result(int roll, String name, int std){
		super(roll, name, std);
	}
	void setMarks() {
		Scanner cin= new Scanner(System.in);
		System.out.print("Enter Marks of three subjects: ");
		marks1= cin.nextFloat();
		marks2= cin.nextFloat();
		marks3= cin.nextFloat();
	}
	void showDetails() {
		super.showDetails();
		System.out.println("\nMarks1= "+ marks1+"\nMarks2= "+ marks2+"\nMarks3= "+ marks3);
	}
}
public class SuperrStudentResult {
	public static void main(String args[]) {
		Result Aman= new Result(11, "Aman", 5);
		Aman.setMarks();
		Aman.showDetails();
	}
}
