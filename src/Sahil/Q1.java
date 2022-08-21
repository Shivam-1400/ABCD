package Sahil;

public class Q1 {
 public static int[] retrievePosition(int[] a,int[] b){
  int[] c=new int[a.length];
  int i;
  for(i=0;i<a.length;i++){
   if(i%2==0)
    c[i]=b[i];
   if(i%2!=0)
    c[i]=a[i]; }
  return c;
 }
 public static void main(String[] args) {
  int[] a={12,1,32,3};
  System.out.print("Array a: [");
  for(int d:a) {
	   System.out.print(d+", ");
	 }
  int[] b={0,12,2,23};
  System.out.print("]\nArray B: ");
  for(int e:b) {
	   System.out.print(e+", ");
	 }
  int[] c=retrievePosition(a,b);
  System.out.print("]\nArray C: [");
  for(int d:c)
   System.out.print(d+", ");
  
  System.out.print("]");
 }
 
}