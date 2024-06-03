package in.coStreamIOPratice;

import java.io.BufferedReader;
import java.io.FileReader;

public class readlinebyline_BufferedReader {
	public static void main(String[] args)throws Exception {
		FileReader li=new FileReader("C:/Users/dell/Documents/New Text Document.txt");
		BufferedReader obj=new BufferedReader(li);
		String str=obj.readLine();
		while(str!=null) {
			System.out.println(str);
			str=obj.readLine();
		}
		li.close();
	}

}
