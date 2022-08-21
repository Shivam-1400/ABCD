package MyQuestions;

public class MstQ1 {
	public static void main(String[] args) {
		int[] a={1,2,3,4};
		int b[]={3,4,5,6};
		System.out.println(MergArrayClass.mergeArray(a,b));
	}
}
class MergArrayClass {
	public static int mergeArray(int[] aRef,int bRef[]){
		int c[]= new int[aRef.length];
		int sum=0;
		
		for(int i=0; i< aRef.length; i++) {
			for(int j=0; j< bRef.length; j++) {
				if(aRef[i]== bRef[j]) {
					c[i]= aRef[i];
				}
			}
		}
		for(int i=0; i< c.length; i++) {
			sum= sum+ c[i];
		}
		return sum;
	}
}