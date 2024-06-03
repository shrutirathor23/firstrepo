package in.coBookExercises;
import java.util.Random;
public class randombet1to100 {
public static void main(String[] args) {
	Random bj=new Random();
	for(int i=0;i<=5;i++) {
		System.out.println(bj.nextInt(100));
	}
}
}
