package animal;

import java.util.ArrayList;
import java.util.List;

public class A1 {

	public static void main(String[] args) {
		List<Animal> list = new ArrayList<>();
		list.add(new Chien("medor", 3));
		list.add(new Chien("riri", 2));
		list.add(new Chien("fifi", 2));
		list.add(new Chien("loulou", 1));

		Animal cat = new Chat("tosca");

		System.out.println(list);

		System.out.println(cat.getType());

	}

}
