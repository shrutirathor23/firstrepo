package in.coBookExercises;

public class ReverseDigit {
	public static void main(String[] args) {
		int n=1234;
		int res=0,rem=0;
		while(n!=0) {
			rem=n%10;
			//System.out.println(rem);
			res =res*10 +rem;
			//System.out.println(res);
			n=n/10;
			//System.out.println(n);
		}
		System.out.println(res);
	}

}
