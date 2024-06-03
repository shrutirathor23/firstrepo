package in.cofirst;

public class ArrayCore {
	public static void main(String args[]) {

		int[] a = { 1, 2, 3, 4, 5 };

		char[] b = { 'a', 'b', 'c' };

		String[] c = { "str1", "str2", "str3" };

		float[] d = { 1.2f, 2.3f };

		for (int i = 0; i < a.length; i++) {
			System.out.println("int" + a[i]);
		}

		for (int k = 0; k < c.length; k++) {
			System.out.println("String" + c[k]);
		}

		for (int m = 0; m < b.length; m++) {
			System.out.println("char" + b[m]);
		}

		for (int n = 0; n <d.length; n++) {
			System.out.println("float " + d[n]);
		}

	}

}
