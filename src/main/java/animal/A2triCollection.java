package animal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class A2triCollection {

	public static void main(String[] args) {

		Set<Chien> tree = new TreeSet<>(new ChienAgeComparator());
		tree.add(new Chien("André", 8));
		tree.add(new Chien("Gislain", 8));
		tree.add(new Chien("Matthieu", 3));
		tree.add(new Chien("Cyrille", 8));
		tree.add(new Chien("Zoé", 3));
		tree.add(new Chien("Thierry", 24));

		Iterator<Chien> it = tree.iterator();

		while (it.hasNext()) {
			System.out.println(it.next());
		}

		System.out.println("================");

		Set<Chien> tree2 = new TreeSet<>((c1, c2) -> Integer.compare(c1.getAge(), c2.getAge()));
		Set<Chien> tree3 = new TreeSet<>(Comparator.comparing(Chien::getAge));

		List<Chien> list1 = new ArrayList<>();

		list1.add(new Chien("André", 8));
		list1.add(new Chien("Gislain", 8));
		list1.add(new Chien("Matthieu", 3));
		list1.add(new Chien("Cyrille", 8));
		list1.add(new Chien("Zoé", 3));
		list1.add(new Chien("Thierry", 24));
		Collections.sort(list1, Comparator.comparing(Chien::getAge) //
				.thenComparing(Comparator.comparing(Chien::getName)) //
				.reversed());
		list1.forEach(System.out::println);
	}

}
