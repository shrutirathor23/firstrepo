package in.cofirst;

import java.text.SimpleDateFormat;
import java.util.*;

public class fomateofDate {
	public static void main(String args[]) {
		Date d=new Date();
		
		SimpleDateFormat format=new SimpleDateFormat("dd/MM/yyyy");
		String str=format.format(d);
		System.out.println("DAte is"+str);
		
		
		
		
	}

}
