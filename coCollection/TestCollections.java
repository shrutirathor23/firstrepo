package in.coCollection;

import java.util.ArrayList;
import java.util.Collection;

public class TestCollections {
	public static void main(String[] args) {
		Collection c = new ArrayList();
		Collection b = new ArrayList();
		c.add(12);
		c.add(12.56);
		c.add("str");
		c.add("str");
		c.add("shruti");
		c.add("str");
		
		b.add(12);
		b.add(12233131);
		b.add("str");
		b.add("choti");
		b.add("shruti");
		b.add("str");
		b.remove("str");
		System.out.println(b);
		System.out.println(b.size());
		//System.out.println(b.contains(12));//print boolean values
		System.out.println(b.containsAll(c));
		//c.addAll(b);
		//c.clear();
		//System.out.println(c.retainAll(b));
		//System.out.println(c);
//		for(Object e: c) {
//			System.out.println(e);
//		}
		//System.out.println(c);
	}

}
