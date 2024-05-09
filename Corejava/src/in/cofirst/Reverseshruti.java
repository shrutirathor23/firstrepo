package in.cofirst;
import java.lang.String;
import java.lang.StringBuffer;
public class Reverseshruti {
	public static void main(String args[]) {
		String stb="shruti";
		String rev=" ";
		for(int i=stb.length()-1;i>=0;i--) {
			rev=rev+ stb.charAt(i);
		}
		System.out.println("reverse is"+rev);
		
	}

}
