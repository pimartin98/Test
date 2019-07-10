package opcr;

public class Ville {

	protected String nomVille;
	protected String nomPays;
	protected int nbreHabitants;
	protected char categorie;

	// Variables publiques qui comptent les instances
	public static int nbreInstances = 0;

	// Variable priv�e qui comptera aussi les instances
	private static int nbreInstancesBis = 0;

	public Ville() {

		// On incr�mente nos variables � chaque appel aux constructeurs
		nbreInstances++;
		nbreInstancesBis++;
		System.out.println("Cr�ation d'une ville !");
		nomVille = "Inconnu";
		nomPays = "Inconnu";
		nbreHabitants = 0;
	}

	public Ville(String pNom, int pNbre, String pPays) {
		System.out.println("Cr�ation d'une ville avec des param�tres !");
		nomVille = pNom;
		nomPays = pPays;
		nbreHabitants = pNbre;
		// On incr�mente nos variables � chaque appel aux constructeurs
		nbreInstances++;
		nbreInstancesBis++;
	}

	// ************* ACCESSEURS *************
	public String getNom() {
		return nomVille;
	}

	// Retourne le nom du pays
	public String getNomPays() {
		return nomPays;
	}

	// Retourne le nombre d'habitants
	public int getNombreHabitants() {
		return nbreHabitants;
	}

	// D�finit le nom de la ville
	public void setNom(String pNom) {
		nomVille = pNom;
	}

	// D�finit le nom du pays
	public void setNomPays(String pPays) {
		nomPays = pPays;
	}

	// D�finit le nombre d'habitants
	public void setNombreHabitants(int nbre) {
		nbreHabitants = nbre;
	}

	private void setCategorie() {

		int bornesSuperieures[] = { 0, 1000, 10000, 100000, 500000, 1000000, 5000000, 10000000 };
		char categories[] = { '?', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H' };

		int i = 0;
		while (i < bornesSuperieures.length && this.nbreHabitants > bornesSuperieures[i])
			i++;

		this.categorie = categories[i];
	}

	// Retourne la description de la ville
	public String decrisToi() {
		return "\t" + this.nomVille + " est une ville de " + this.nomPays + ", elle comporte : " + this.nbreHabitants
				+ " habitant(s) => elle est donc de cat�gorie : " + this.categorie;
	}

	// Retourne une cha�ne de caract�res selon le r�sultat de la comparaison
	public String comparer(Ville v1) {
		String str = new String();

		if (v1.getNombreHabitants() > this.nbreHabitants)
			str = v1.getNom() + " est une ville plus peupl�e que " + this.nomVille;

		else
			str = this.nomVille + " est une ville plus peupl�e que " + v1.getNom();

		return str;
	}

	public static int getNombreInstancesBis() {
		return nbreInstancesBis;
	}

}
