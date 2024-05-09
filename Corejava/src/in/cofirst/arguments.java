package in.cofirst;

public class arguments {
	public static void main(String args[]) {
		if (args.length == 2) {
			System.out.println("hello" + args[0] + args[1]);
		} else {
			System.out.println("PArameters requires");
		}

	}
}
