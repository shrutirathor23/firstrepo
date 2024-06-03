package in.coSortingComparator;

import java.util.Comparator;

public class OrderByMarkDesc implements Comparator<Marksheet> {

	@Override
	public int compare(Marksheet o1, Marksheet o2) {
		// TODO Auto-generated method stub
		if(o1.marks>o2.marks) {
			return -1;
		}
		else if(o1.marks==o2.marks) {
			return 0;
		}else {
			return 1;
		}
	}

}
