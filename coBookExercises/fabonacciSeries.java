package in.coBookExercises;

public class fabonacciSeries {
	public static void main(String[] args) {
		// 0 1 1 2 3 5 8
		int a=0,b=1,c=0;
		int n=5;
		while(n>=0) {
		c=a+b;
		a=b;
		b=c;
		n--;
		System.out.println(c);
		}
		
	}

}
