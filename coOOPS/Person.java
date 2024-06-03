package in.coOOPS;

public class Person {
String firstname;
String lastname;
public Person(String firstname, String lastname) {
	super();
	this.firstname = firstname;
	this.lastname = lastname;
}
public Person() {
	super();
}
@Override
public String toString() {
	return "Person [firstname=" + firstname + ", lastname=" + lastname + "]";
}
public static void main(String[] args) {
Person p=new Person("shruti","Rathore");
System.out.println(p.toString());
	}
}
