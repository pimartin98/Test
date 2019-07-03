package animal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class A2iterator {

	public static void main(String[] args) {

		List<Animal> list = new ArrayList<>();
		list.add(new Chien("medor", 3));
		list.add(new Chien("riri", 2));
		list.add(new Chien("fifi", 2));
		list.add(new Chien("loulou", 1));
		list.add(new Chat("tosca"));
		list.add(new Chien("medor", 4));

		Iterator<Animal> iterator = list.iterator();
		while (iterator.hasNext()) {
			Animal next = iterator.next();
			System.out.println(next);
		}
	}

}
