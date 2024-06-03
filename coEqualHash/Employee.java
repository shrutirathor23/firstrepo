package in.coEqualHash;

public class Employee {
	int id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	int salary;
	String name;
	
	@Override
	public boolean equals(Object obj) {
		if(obj==null) {
			return false;
		}if(!(obj instanceof Employee)) {
			return false;
		}
		Employee e=(Employee) obj;
		boolean b=this.id==e.id && this.name==e.name && this.salary==e.salary;
		return b;
	}
	@Override
	public int hashCode() {
		String str=id+name+salary;
		return str.hashCode();
	}
	@Override
	public String toString() {
		return "Employee [id="+id+",name="+name+", salary = "+salary+"]";
	}


}
