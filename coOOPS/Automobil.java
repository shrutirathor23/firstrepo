package in.coOOPS;

public class Automobil {
	private String color;
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public double getSpeed() {
		return speed;
	}
	public void setSpeed(double speed) {
		this.speed = speed;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public int getNumberOfGears() {
		return numberOfGears;
	}
	public void setNumberOfGears(int numberOfGears) {
		this.numberOfGears = numberOfGears;
	}
	
	public void displayGears () {
		System.out.println("no of gears is"+numberOfGears);
	}
	private double speed;
	private String make;
	private int numberOfGears;
	public Automobil(String color, double speed, String make, int numberOfGears) {
		this.color = color;
		this.speed = speed;
		this.make = make;
		this.numberOfGears = numberOfGears;
	}
	public static void main(String[] args) {
		Automobil mob = new Automobil("Black",80,"Harrier",3);
		System.out.println("colour of car is"+mob.color);
		System.out.println("speed of car is"+mob.speed);
		System.out.println("model of car is"+mob.make);
		//System.out.println("numbers of gear is"+mob.numberOfGears);
		mob.displayGears();
	}

}
