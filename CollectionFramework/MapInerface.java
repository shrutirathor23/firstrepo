package CollectionFramework;

import java.util.HashMap;

public class MapInerface {
	public static void main(String[] args) {
		HashMap map=new HashMap();
		System.out.println(map.put(1, "shruti"));
		for (int i = 1; i<=5; i++) {
			map.put(i, "shruti");
		}
		System.out.println(map);
	}

}
