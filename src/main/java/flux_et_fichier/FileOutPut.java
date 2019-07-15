package flux_et_fichier;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

//Ecrire un programme qui enregistre dans un fichier binaire différents nb entiers

public class FileOutPut {
	public static void main(String[] args) throws IOException {
		// FileOutputStream f = new FileOutputStream("entier.dat");
		// DataOutputStream sortie = new DataOutputStream(f);
		// les deux lignes du dessus sont identiques aux suivantes :
		String nomfich = "C:\\tmp\\toto";
		int n;
		try (DataOutputStream sortie = new DataOutputStream(new FileOutputStream(nomfich))) {
			sortie.writeInt(4);
			sortie.writeInt(40);
		}

	}

}
 