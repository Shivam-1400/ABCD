/*
Create an abstract class section() having abstract methods students() and faculty().

Create two more classes groupA() and groupB() inheriting class section() and methods students() to print names of all students and method faculty() to 
print names of all their teachers. Call both the methods.
 */

package Ankita;

abstract class Section{
	abstract void students();
	abstract void faculty();
}

class GroupA extends Section{
	void students() {
		System.out.println("Group A Students: \n\ta) Aman\n\tb) Raman\n\tc) Chaman\n");
	}
	void faculty() {
		System.out.println("Group A Faculty: \n\ta) Navjot Kaur\n\tb) Gurpreet Singh\n\tc) Amanpreet Kaur\n");
	}
	
}
class GroupB extends Section{
	void students() {
		System.out.println("Group B Students: \n\ta) Ram\n\tb) Shyam\n\tc) Gyan\n");
	}
	void faculty() {
		System.out.println("Group B Faculty: \n\ta) Devadeep Kaporr\n\tb) Deepa Kumari\n\tc) Kulvinder Singh\n");
	}
	
}

public class AbstractClassRoom {
	public static void main(String args[]) {
		GroupA A= new GroupA();
		A.students();
		A.faculty();
		
		GroupB B= new GroupB();
		B.students();
		B.faculty();
		
		
	}
}
