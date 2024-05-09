package in.cofirst;

public class Methodcreation {
	public static void main(String args[]) {
		sub(10,20);
		add(20,50);
	}
	public static void sub(int a,int b) {
		int sum=a-b;
		System.out.println("sub is"+sum);
	}
	public static void add(int a, int b) {
		int num=a+b;
		System.out.println("sum is"+num);
	}

}
