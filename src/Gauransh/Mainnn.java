package Gauransh;

abstract class abs{
	   public abs()
	   {
	       System.out.println("This is constructor of abstract class");
	   }
	   abstract void a_method();

	   public void a_nonmethod()
	   {
	         System.out.println("This is normal method of abstract class");
	   }

	
	}
class subabs extends abs{
  public void a_method()
   {
         System.out.println("This is abstract method");
   }
     
 }
 public class Mainnn{
     public static void main(String args[]){
     abs a = new subabs();
     a.a_nonmethod();
     a.a_method();

 }}