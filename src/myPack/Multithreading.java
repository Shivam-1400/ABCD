package myPack;

public class Multithreading {
	  public static void main(String args[]) throws Exception{
		  ProcessQ4 even= new ProcessQ4(1, 20, 0, "Even");
		  ProcessQ4 odd= new ProcessQ4(1, 20, 1, "Odd");
		  even.setPriority(10);
		  even.join();
		  odd.join();
	    
	  }
	  
	}
	class ProcessQ4 extends Thread{
	  int sp, ep, r;
	  ProcessQ4(int a, int b, int remainder, String name){
	    sp= a; 
	    ep= b;
	    r= remainder;
	    setName(name);
	    start();
	  }
	  public void run(){
	    for(int i=sp; i<= ep; i++) {
	    	try {
	    		sleep(10);
	    	}catch(Exception e) {}
	    	
	    	if(i%2== r) {
	    		System.out.println(i);
	    	}
	    	
	    }
	    System.out.println(Thread.currentThread()+" ENDS.");
	  }
	  
	}
