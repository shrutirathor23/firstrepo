package in.coThreading;

public class RacingCondThread extends Thread{
	public static Account data=new Account();
	String name=null;
	public RacingCondThread(String name) {
		this.name=name;
	}
    public void run() {
    	for(int i=0;i<5;i++) {
    		data.desposit(name, 1000);
    	}
    }
    public static void main(String[] args) {
		RacingCondThread t1=new RacingCondThread("ram");
		RacingCondThread t2=new RacingCondThread("shymnsjd");
		t1.start();
		t2.start();
	}
}
