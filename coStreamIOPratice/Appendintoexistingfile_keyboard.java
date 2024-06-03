package in.coStreamIOPratice;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Appendintoexistingfile_keyboard {
	public static void main(String[] args) throws Exception{
		InputStreamReader isReader=new InputStreamReader(System.in);
		BufferedReader in =new BufferedReader(isReader);
		
		PrintWriter out=new PrintWriter("D:\\newfilejava2.txt");
		
		String line=in.readLine();
		while(!line.equals("quit")) {
			out.println(line);
			line=in.readLine();
		}
		out.close();
		in.close();
		System.out.println("done");
	}

}
