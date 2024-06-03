package in.coInheriatance;

public class shape {
	public static shape getShape(int i) {
		if(i==1) {
			return new circle(2);
		}
		if(i==2) {
			return new Rectangle(2,5);
		}
		if(i==3) {
			return new Triangle(2,5);
		}
		return new shape();
	}
	public double area() {
		return 0;
	}
	public shape() {
		
	}

}
