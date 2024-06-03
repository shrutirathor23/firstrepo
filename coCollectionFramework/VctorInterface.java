package in.coCollectionFramework;

import java.util.Vector;

public class VctorInterface {
	public static void main(String[] args) {
		Vector v=new Vector();
		v.add(1);
		v.add(123);
		v.add(12);
		v.add("shruti");
		System.out.println(v.contains(12));
		System.out.println(v.firstElement());
		System.out.println(v.elementAt(2));
		System.out.println(v.get(2));
	}

}
