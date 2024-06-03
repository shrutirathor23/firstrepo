package in.coOOPS;

public class circle extends ShapeInheritance {
	int radius;

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
	
    public int area() {
    	return 3*radius*radius;
    }
}
