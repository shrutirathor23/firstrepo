package in.coCollectionFramework;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;


public class IteratorList {
	public static void main(String[] args) {
		ArrayList c = new ArrayList();
		c.add("strti");
		c.add("strqw");
		c.add(123);
		c.add(12.45);

		Iterator it =c.iterator();
		while(it.hasNext()) {
			Object o=it.next();
			System.out.println(o);
		}

	}
}
