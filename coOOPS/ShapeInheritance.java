package in.coOOPS;

public abstract class ShapeInheritance {
	String colour;
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public int getBorderWidth() {
		return borderWidth;
	}
	public void setBorderWidth(int borderWidth) {
		this.borderWidth = borderWidth;
	}
	int borderWidth;
	public abstract int area();

}
