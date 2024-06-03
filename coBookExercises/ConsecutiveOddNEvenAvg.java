package in.coBookExercises;

public class ConsecutiveOddNEvenAvg {
	public static void main(String[] args) {
		int n=100;
		int evensum=0,oddsum=0,oddavg=0,evenavg=0;
		int counteven=0,countodd=0;
		while(n>2) {
			if(n%2==0) {
				counteven++;
				evensum=evensum+n;
			}else {
				countodd++;
				oddsum=oddsum+n;
			}
			n--;
		}
		System.out.println(evensum);
		System.out.println(counteven);
		evenavg=evensum/counteven;
		oddavg=oddsum/countodd;
		System.out.println("even averge is"+evenavg);
		System.out.println("odd average is"+oddavg);
	}

}
