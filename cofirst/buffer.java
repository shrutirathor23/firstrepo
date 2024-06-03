package in.cofirst;
import java.lang.StringBuffer;

public class buffer {
	public static void main(String args[]) {
		
		StringBuffer sb=new StringBuffer("Shruti");
		sb.append("shruti rathore");
		
		
		System.out.println("Length"+sb.length());
		System.out.println("Capacity"+sb.capacity());
		System.out.println("char at"+sb.charAt(4));
		System.out.println("index of "+sb.indexOf("shruti"));
		System.out.println(" Replace"+sb.replace(0, 4, "hell"));
		System.out.println("Reverse "+sb.reverse());
	}

}
