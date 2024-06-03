package in.coInheriatance;

public class Triangle extends shape{
private int base;
private int heigth;
public Triangle(){
	
}
public Triangle(int base, int heigth) {
	super();
	this.base = base;
	this.heigth = heigth;
}

public double area() {
	return base*heigth;
}
}
