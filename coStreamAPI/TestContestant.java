package in.coStreamAPI;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class TestContestant {
	public static void main(String[] args) {
		List<Contestant> list=new ArrayList<>();
		list.add(new Contestant("shruti","7222978114"));
		list.add(new Contestant("shruti","72229781344"));
		list.add(new Contestant("shru","7222978114"));
		list.add(new Contestant("shr","7222978114455"));
		list.add(new Contestant("sh","7222978233"));
		list.add(new Contestant("s","7222978129"));
		
		list.stream().map(e->e.phone).filter(e->e.length()==10).distinct().
		collect(Collectors.collectingAndThen(Collectors.toList(), e->{Collections.shuffle(e);
		return e.stream();
		})).limit(3).forEach(e->{
			System.out.println("valid nos"+e);
		});
		
	}

}
