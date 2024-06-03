package CollectionFramework;

import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class SetInterface {
	public static void main(String[] args) {
		SortedSet s=new TreeSet(); 
		s.add("123");
		s.add("I'm");
		s.add("happy");
		s.add("shruti");
		System.out.println(s.first());
		System.out.println(s.last());
		System.out.println(s.headSet("str"));
		System.out.println(s.tailSet("happy"));
		System.out.println(s.subSet( "happy","happy"));
		System.out.println(s);
		System.out.println("successfully completed");
		
		
	}

}
