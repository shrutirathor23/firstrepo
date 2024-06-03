package in.coThreading;

public class Testrunnable {
	public static void main(String[] args) {
		Thread t1=new Thread();
		Thread t2 = new Thread();
		
		t1.start();
		t2.start();
		for(int i=0;i<50;i++) {
			System.out.println("main");
		}
	}

}
