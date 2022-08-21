package Suraj;

public class Q3 {
	public static void main(String args[]) {
		ProcessQ3 Scooby= new ProcessQ3("Scooby");
		ProcessQ3 Shaggy= new ProcessQ3("Shaggy");
	}

}
class ProcessQ3 extends Thread{
	public ProcessQ3(String name) {
		setName(name);
		start();
	}
	public void run() {
		
		System.out.println(Thread.currentThread()+"Start");
	}
}
