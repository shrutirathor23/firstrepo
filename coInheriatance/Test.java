package in.coInheriatance;

public class Test {
public static void main(String[] args) {
	shape s1=shape.getShape(1);
	shape s2=shape.getShape(2);
	shape s3=shape.getShape(3);
	System.out.println("area of circle"+s1.area());
	System.out.println("area of rectangle "+s2.area());
	System.out.println("area of triangle"+s3.area());
}
}
