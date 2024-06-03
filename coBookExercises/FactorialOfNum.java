package in.coBookExercises;

public class FactorialOfNum {
	public static void main(String[] args) {
		int n=4,fact=1;
		while(n!=0) {
			fact=fact*n;
			n--;
			}
		System.out.println(fact);
	}

}
