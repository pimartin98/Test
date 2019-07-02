package animal;

public class A1 {

	public static void main(String[] args) {
		Animal c1 = new Chien("medor");
		Animal cat = new Chat("tosca");

		System.out.println(c1);

		System.out.println(cat.getType());

	}

}
