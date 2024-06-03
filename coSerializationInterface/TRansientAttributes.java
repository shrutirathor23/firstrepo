package in.coSerializationInterface;

import java.io.Serializable;

public class TRansientAttributes implements Serializable {
public String name="null";
public int maths=0;
public int physics=0;
public int chemistry=0;
private transient int total=0;
private transient double percentage=0;
}
