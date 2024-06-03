package in.coBookExercises;

public class Palindrome {
	/*Input : n = 46355364
Output: Reverse of n = 46355364
Palindrome : Yes*/
	public static void main(String[] args) {
		int rem,res=0,n=121,temp=n;
		while(n!=0) {
			rem=n%10;
			res=res*10+rem;
			n=n/10;
		}
		System.out.println(res);
		if(temp==res) {
			System.out.println("palindrome");
		}else {
			System.out.println("not palindrome");
	}
	}

}
