package in.coThreading;
import static java.lang.Thread.*;
public class TestHelloThread {
public static void main(String[] args) {
	HelloThread t1 = new HelloThread("Ram");
	HelloThread s1 = new HelloThread("Rshj");
	t1.start();
	s1.start();
	for(int i=0;i<50;i++) {
		System.out.println("main");
	}
}
}
