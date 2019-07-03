package animal;

import java.util.Comparator;

public class ChienAgeComparator implements Comparator<Chien> {

	@Override
	public int compare(Chien o1, Chien o2) {
		return Integer.compare(o1.getAge(), o2.getAge());
	}

}
