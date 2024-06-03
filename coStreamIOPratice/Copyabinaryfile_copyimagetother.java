package in.coStreamIOPratice;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Copyabinaryfile_copyimagetother {
	public static void main(String[] args)throws Exception {
		String source="C:\\Users\\dell\\Pictures\\shrutisaree1.jpg";
		String target="C:\\Users\\dell\\Pictures\\beautiful.jpg";
		
		FileInputStream in =new FileInputStream(source);
		FileOutputStream out =new FileOutputStream(target);
		
		int ch=in.read();
		while(ch!=-1) {
			out.write(ch);
			ch=in.read();
		}
		in.close();
		out.close();
		System.out.println("checked");
	}

}
