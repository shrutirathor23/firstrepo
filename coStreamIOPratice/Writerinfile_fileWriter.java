package in.coStreamIOPratice;

import java.io.FileWriter;

public class Writerinfile_fileWriter {
	public static void main(String[] args) throws Exception {
		FileWriter li=new FileWriter("d:/newfilejava.txt");
		li.write("shruti Rathore");
		li.write("shrut Rathore");
		li.write("shru Rathore");
		li.write("shr Rathore");
		li.close();
		System.out.println("done");
	}

}
