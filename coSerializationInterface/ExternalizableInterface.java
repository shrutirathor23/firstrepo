package in.coSerializationInterface;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class ExternalizableInterface implements Externalizable {
public String id=null;
public String firstName=null;
public String lastName=null;
public double salary=0;
@Override
public void writeExternal(ObjectOutput out) throws IOException {
	// TODO Auto-generated method stub
	out.writeObject(id);
	out.writeObject(firstName);
    out.writeObject(lastName);	
    out.writeDouble(salary);
	
}
@Override
public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
	// TODO Auto-generated method stub
	id=(String)in.readObject();
	firstName=(String)in.readObject();
	lastName=(String)in.readObject();
	salary=in.readDouble();
	
	
}


}
