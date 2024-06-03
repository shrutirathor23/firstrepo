package in.coCollectionFramework;

import java.util.Stack;

public class StackInterface {
	public static void main(String[] args) {
		Stack st=new Stack();
		st.push(12);
		st.push(1234);
		st.push("shru");
		st.push("kt");
	st.pop();
	st.pop();
	System.out.println(st.peek());
	System.out.println(st);
	}

}
