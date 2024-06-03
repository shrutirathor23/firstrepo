package in.coOOPS;

public class ConstructorOver {
	public ConstructorOver() {
		System.out.println("defualt parameter");
	}

	public ConstructorOver(int a) {
        this();
		System.out.println("single parameter");
		// this();
	}

	public ConstructorOver(int a, int b) {
		// this(a);
		System.out.println("double parameter");
	}

	public  ConstructorOver(int a, int b, int c) {
		System.out.println("triple parameter");
	}

	public static void main(String[] args) {
		ConstructorOver a = new ConstructorOver(20,10);
	}

}
