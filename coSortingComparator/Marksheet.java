package in.coSortingComparator;
import java.lang.*;

public class Marksheet implements Comparable<Marksheet>{
	public String rollNo;
	public String name;
	public int marks;

	public Marksheet(String r,String n,int m) {
		this.rollNo=r;
		this.name=n;
		this.marks=m;
	}
		@Override
		public int compareTo(Marksheet o) {
			// TODO Auto-generated method stub
			return rollNo.compareTo(o.rollNo);
		}
		
		public String toString() {
			return rollNo+","+name+","+marks;
		}

	}

