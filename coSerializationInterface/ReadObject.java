package in.coSerializationInterface;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ReadObject {
	public static void main(String[] args)throws Exception {
		FileInputStream file = new FileInputStream("D:\\newfilejava2.txt");
		ObjectInputStream in = new ObjectInputStream(file);
		
		Marksheet m =(Marksheet)in.readObject();
		
		System.out.println(m.name);
		System.out.println(m.chmistry);
		System.out.println(m.physic);
		System.out.println(m.maths);
		
		in.close();
		file.close();
	}

}
