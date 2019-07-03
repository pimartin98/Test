package animal;

public class Chien extends NamedAnimal {

	private final int age;

	public Chien(String name, int age) {
		super("chien", name);
		this.age = age;
	}

	public int getAge() {
		return age;
	}

}
