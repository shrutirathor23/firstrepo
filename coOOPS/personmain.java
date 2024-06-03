package in.coOOPS;
import java.time.*;
public class personmain {
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public LocalDate getDob() {
		return dob;
	}
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	private LocalDate dob;
	private String address;
	
	public int getAge() {
		LocalDate currentDate = LocalDate.now();
		return Period.between(dob, currentDate).getYears();
	}
	public personmain(String name, LocalDate dob, String address) {
		super();
		this.name = name;
		this.dob = dob;
		this.address = address;
	}
	
	public static void main(String[] args) {
		LocalDate dob = LocalDate.of(2002, 03, 23);
	 personmain per=new personmain ("shruti" ,dob,"Ratlam");
	System.out.println( per.getName());
	 System.out.println(per.getDob());
	 System.out.println(per.getAddress());
	 System.out.println(per.getAge());
	
	
	}
	

}
