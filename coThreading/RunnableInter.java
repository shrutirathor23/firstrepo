package in.coThreading;

public class RunnableInter implements Runnable {
	String name=null;
	public RunnableInter(String n) {
		name=n;
	}
   public void run() {
	   for(int i=0;i<50;i++) {
		   System.out.println(i+name);
	   }
   }
}
