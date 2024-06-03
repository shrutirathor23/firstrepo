package in.coEqualHash;

public class TestEmployee {
	public static void main(String[] args) {
		Employee e1=new Employee();
		Employee e2=new Employee();
		e1.setId(1);
		e1.setName("ab");
		e1.setSalary(1000);
		e1.getId();
		e1.getName();
		e1.getSalary();
		
		e2.setId(1);
		e2.setName("abcd");
		e2.setSalary(1000);
		e2.getId();
		e2.getName();
		e2.getSalary();
		
		System.out.println(e1.hashCode()==e2.hashCode());
	}

}
