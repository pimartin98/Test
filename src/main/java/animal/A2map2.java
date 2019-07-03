package animal;

import java.util.HashMap;
import java.util.Map;

public class A2map2 {

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();
		map.put(1, "toto");
		map.put(2, "titi");
		map.put(3, "tutu");
		map.put(1, "Q");
		System.out.println(map);
		System.out.println(map.keySet());
		System.out.println(map.values());
	}

}
