package animal;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class A2list {

	public static void main(String[] args) {

		List<Animal> list = new ArrayList<>();
		list.add(new Chien("medor", 3));
		list.add(new Chien("riri", 2));
		list.add(new Chien("fifi", 2));
		list.add(new Chien("loulou", 1));
		list.add(new Chat("tosca"));

		List<Animal> list2 = new ArrayList<>();
		list2.add(new Chien("medor", 8));

		System.out.println(list.containsAll(list2));

		for (Animal animal : list) {
			System.out.println(animal);
		}

		System.out.println("=================");
		list.forEach(new Consumer<Animal>() {
			@Override
			public void accept(Animal t) {
				System.out.println(t);
			}
		});

		System.out.println("=================");
		list.forEach((Animal t) -> System.out.println(t));
		list.forEach((t) -> System.out.println(t));
		list.forEach(t -> System.out.println(t));

		System.out.println("=================");
		list.forEach(System.out::println);
	}

}
