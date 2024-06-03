package in.coThreading;

public class TestHelloNoThread {
	public static void main(String[] args) {
		
		HelloNoThread t1 = new HelloNoThread("Ram");
		HelloNoThread s1 = new HelloNoThread("Rshj");
		t1.run();
		s1.run();
	}

}
