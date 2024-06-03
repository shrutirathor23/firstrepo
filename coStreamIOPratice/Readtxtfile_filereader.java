package in.coStreamIOPratice;

import java.io.FileReader;

public class Readtxtfile_filereader {
public static void main(String[] args)throws Exception {
	FileReader li=new FileReader("C:/Users/dell/Documents/New Text Document.txt");
	int ch=li.read();
	while(ch!=-1) {
		System.out.print((char)ch);
		ch=li.read();
	}
	li.close();
}
}
