package in.coInheriatance;

public class circle extends shape{
private double radius;

public circle(double radius) {
	
	this.radius = radius;
}
public circle() {
	
}
public double area() {
	return 3.14*radius*radius;
}
}
