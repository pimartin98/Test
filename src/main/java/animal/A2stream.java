package animal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class A2stream {

	public static void main(String[] args) {

		List<Animal> list = new ArrayList<>();
		list.add(new Chien("medor", 3));
		list.add(new Chien("riri", 2));
		list.add(new Chien("fifi", 2));
		list.add(new Chien("loulou", 1));
		list.add(new Chat("tosca"));
		list.add(new Chien("medor", 4));

		// ----------- anicenne methode
		List<Chien> filtered = new ArrayList<>();
//		Animal animal = null;
//		for (int i = 0; i < list.size(); i++) {
//			animal = list.get(i);
//		}
		for (Animal animal : list) {
			if (animal instanceof Chien) {
				Chien chien = (Chien) animal;
				if (chien.getAge() >= 2) {
					filtered.add(chien);
				}
			}
		}

		Collections.sort(filtered);
		for (Chien chien : filtered) {
			System.out.println(chien);
		}

		System.out.println("-------------");

		// ----------- depuis java 8 : stream
		list.stream() //
				.filter(a -> a instanceof Chien) //
				.map(a -> (Chien) a) //
				.filter(c -> c.getAge() >= 2) //
				.sorted() //
				.forEach(System.out::println);
	}
}