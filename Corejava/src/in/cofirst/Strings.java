package in.cofirst;

public class Strings {
	public static void main(String args[]) {
		String name="shruti";
		String surname="RATHORE";
		System.out.println("length of the string"+name.length());
		System.out.println("5th character is "+name.charAt(4));
		System.out.println("shruti index is of"+name.indexOf("Shruti"));
		System.out.println("r first index is "+name.indexOf("r"));
		System.out.println("r first index is "+name.indexOf("r"));
		System.out.println("r is replaced by h "+name.replace("r", "h"));
		System.out.println("uppercase"+name.toUpperCase());
		System.out.println("Lowercase"+surname.toLowerCase());
		System.out.println("start with shruti if yes returns true else false  "+name.startsWith("syui"));
	    System.out.println("ends with "+name.endsWith("ore"));
	    System.out.println("substring "+name.substring(4));
	
	}

}
