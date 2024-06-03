package in.coStreamIOPratice;

import java.io.FileReader;
import java.util.Scanner;

public class readby_scanner {
	public static void main(String[] args) throws Exception{
		FileReader li =new FileReader("C:/Users/dell/Documents/New Text Document.txt");
		Scanner obj=new Scanner(li);
		while(obj.hasNext()) {
			System.out.println(obj.next());
		}
		li.close();
	}

}
