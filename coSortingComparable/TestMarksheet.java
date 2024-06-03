package in.coSortingComparable;

import java.util.ArrayList;
import java.util.Collections;

public class TestMarksheet {
	public static void main(String[] args) {
		ArrayList marksheets = new ArrayList();
		marksheets.add(new Marksheet("a2","shruti",100));
		marksheets.add(new Marksheet("a3","shrutids",95));
		marksheets.add(new Marksheet("a4","shrutidfds",99));
		
		Collections.sort(marksheets);
		for(Object o : marksheets)
		{
			System.out.println(o);
		}
		
	}

}
