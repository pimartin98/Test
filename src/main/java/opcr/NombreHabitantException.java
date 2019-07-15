package opcr;

public class NombreHabitantException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1848425835249390646L;

	public NombreHabitantException() {

		System.out.println("nb habitant de la ville n�gatif");

	}

	public NombreHabitantException(int nbre) {

		System.out.println("Instanciation avec un nombre d'habitants n�gatif.");
		System.out.println("\t => " + nbre);
	}
}