package in.coStreamAPI;

public class Employee {
	public String name;
	public String getName() {
		return name;
	}
	public int getSalary() {
		return salary;
	}
	public int salary;
	public Employee(String name, int salary) {
		super();
		this.name = name;
		this.salary = salary;
	}

}
