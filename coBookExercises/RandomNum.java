package in.coBookExercises;

import java.util.Random;

public class RandomNum {
	public static void main(String[] args) {
		Random o =new Random();
//		int m = o.nextInt(100);
//        System.out.println(m);
		int b;
		int count=0;
		for(int i=1;i<=100;i++) {
			while(count<=5) {
				b=o.nextInt();
				count++;
				System.out.println(b);
			}
		}
	}

}
