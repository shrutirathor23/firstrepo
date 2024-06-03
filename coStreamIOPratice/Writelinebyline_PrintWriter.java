package in.coStreamIOPratice;

import java.io.FileWriter;
import java.io.PrintWriter;

public class Writelinebyline_PrintWriter {
	public static void main(String[] args)throws Exception {
		FileWriter out=new FileWriter("d:/newfilejava.txt");
		PrintWriter li=new PrintWriter(out);
		for(int i=0;i<5;i++) {
			li.println("shruti");
		}
		li.close();
		out.close();
	}

}
