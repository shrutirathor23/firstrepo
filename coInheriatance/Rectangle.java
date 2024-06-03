package in.coInheriatance;

public class Rectangle extends shape {
	
private int length;
private int width;
public Rectangle(int length, int width) {
	super();
	this.length = length;
	this.width = width;
}
public Rectangle() {
	
}
public double area() {
	return length*width;
}
}
