package opcr;

public class Capitale extends Ville {

	private String monument;

	public static void main(String[] args) throws NombreHabitantException, NomVilleException {

		// Capitale cap = new Capitale();
		// System.out.println(cap.decrisToi());
		Capitale cap = new Capitale("Paris", 654987, "France", "la tour Eiffel");
		System.out.println(cap.decrisToi());
	}

	public Capitale() {
		super();
		monument = "aucun";
	}

	// Constructeur d'initialisation de capitale
	public Capitale(String nom, int hab, String pays, String monument)
			throws NombreHabitantException, NomVilleException {
		super(nom, hab, pays);
		this.monument = monument;
	}

	@Override
	public String decrisToi() {
		String str = super.decrisToi() + "\n \t ==>>" + this.monument + " en est un monument";
		System.out.println("Invocation de super.decrisToi()");

		return str;
	}

}
