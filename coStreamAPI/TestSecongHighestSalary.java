package in.coStreamAPI;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TestSecongHighestSalary {
	public static void main(String[] args) {
	List<Employee> li=new ArrayList<> ();
    li.add(new Employee("shruti",100000));
    li.add(new Employee("shruti",90000));
    li.add(new Employee("shruti",80000));
    li.add(new Employee("shruti",70000));
    li.add(new Employee("shruti",90000));
    li.add(new Employee("shruti",20000));
    
    double sechigh = li.stream().map(e->e.getSalary()).distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst().orElse(0);
    System.out.println(sechigh);
}
}
