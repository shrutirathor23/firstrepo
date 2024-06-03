package in.cofirst;

import java.util.Random;


public class randomnumber {
	public static void main(String args[]) {
		
		Random a = new Random();
		int x= a.nextInt(100);
		System.out.println("random is"+x);
		
	}
}
