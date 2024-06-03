package in.coExceptionHandling;

public class tryCatch {
	public static void main(String[] args) {
		int a=0;
		int b=15;
		try {
		int div=b/a;
		System.out.println();
	}catch(Exception e) {
		e.printStackTrace();
	}
	finally {
		System.out.println("invalid");
	}
//		try {}
//		catch(RuntimeException e) {
//			System.out.println("runtime");
//		}
//		catch(ArithmeticException e) {
//			System.out.println("arithmethic");
//		}
}}
