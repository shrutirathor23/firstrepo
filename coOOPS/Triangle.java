package in.coOOPS;

public class Triangle extends ShapeInheritance{
	int base ;
	int heigth;
	public int getBase() {
		return base;
	}
	public void setBase(int base) {
		this.base = base;
	}
   public int area() {
	   return 1/2*base*heigth;
   }
}
