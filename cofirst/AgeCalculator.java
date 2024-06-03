package in.cofirst;

import java.text.SimpleDateFormat;
import java.util.*;

public class AgeCalculator {
	public static void main(String args[]) {
//	String birthdate ="23/03/2002";
//	Date d=new Date();
//	SimpleDateFormat format =new SimpleDateFormat("dd/MM/yyyy");
//	String str1=format.format(d);

		Date d =new Date();
		System.out.println(d); //print date with time 
		SimpleDateFormat s =new SimpleDateFormat("dd/MM/yyyy");
		System.out.println(s);
		String str =s.format(d);
		System.out.println(str);
		
	}

}
