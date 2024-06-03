package in.coSerializationInterface;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObject {
	public static void main(String[] args)throws IOException {
		
		FileOutputStream file = new FileOutputStream("D:\\newfilejava2.txt");
		ObjectOutputStream out=new ObjectOutputStream(file);
		
		Marksheet m =new Marksheet();
		m.name="ram";
		m.physic=23;
		m.chmistry=45;
		m.maths=90;
		
		out.writeObject(m);;
		out.close();
		file.close();
	}

}
