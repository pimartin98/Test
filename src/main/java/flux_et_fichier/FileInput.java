package flux_et_fichier;

import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;

public class FileInput {

	public static void main(String[] args) throws IOException {
		// FileOutputStream f = new FileOutputStream("entier.dat");
		// DataOutputStream sortie = new DataOutputStream(f);
		// les deux lignes du dessus sont identiques aux suivantes :
		String nomfichin = "C:\\tmp\\toto";

		int n = 0;
		boolean eof = false;

		try (DataInputStream entree = new DataInputStream(new FileInputStream(nomfichin))) {
			while (!eof) {
				try {
					n = entree.readInt();
					System.out.println(n);
				} catch (EOFException e) {
					eof = true;
				}

			}

		}

	}
}
