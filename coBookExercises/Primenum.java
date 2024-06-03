package in.coBookExercises;

public class Primenum {
	public static void main(String[] args) {
		//A prime number that is divisible only by 1 and itself.
		//For example: 2, 3, 5, 7, 11, 13, 17.
		int n=2;
		if(n%n==0) {
			System.out.println("prime");
		}else 
			System.out.println("not prime");
	}

}
