package in.coOOPS;

public class Rectangle extends ShapeInheritance{
	int length ;
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	int width;
	@Override
	public int area() {
		// TODO Auto-generated method stub
		return length*width;
	}
}
