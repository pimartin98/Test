package opcr;

public class Sdz1 {

	public static void main(String[] args) throws NombreHabitantException, NomVilleException {

		Ville v = null;

		try {
			v = new Ville("Re", 3, "France");
		}

//Gestion de l'exception sur le nombre d'habitants
		catch (NombreHabitantException | NomVilleException e) {
			System.out.println(e.getMessage());
		}

		finally {
			if (v == null)
				v = new Ville();
		}

		System.out.println(v.toString());

	}
}