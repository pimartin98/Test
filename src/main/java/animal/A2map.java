package animal;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class A2map {

	public static void main(String[] args) {

		List<Chien> list = new ArrayList<>();
		list.add(new Chien("medor", 3));
		list.add(new Chien("riri", 2));
		list.add(new Chien("fifi", 2));
		list.add(new Chien("loulou", 1));

		Map<String, Chien> map = new HashMap<>();

		for (Chien c : list) {
			map.put(c.getName(), c);
		}

		list.forEach(c -> map.put(c.getName(), c));

		System.out.println(map);
		System.out.println(map.get("medor"));
		System.out.println(map.get("inconnu"));
	}

}
