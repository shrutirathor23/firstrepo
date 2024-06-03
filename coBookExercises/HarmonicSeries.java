package in.coBookExercises;

public class HarmonicSeries {
public static void main(String[] args) {
	//H(n) = 1 + 1/2 + 1/3 + 1/4 + ... + 1/n  
	int n=5;
	double sum=0.0,num;
	for(int i=1;i<=n;i++) {
		sum+=1.0/i;
		System.out.println(sum);
	}
	
}
}
