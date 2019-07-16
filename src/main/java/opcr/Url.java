package opcr;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;

public class Url {
	public static void main(String[] args) {
		try {
			String siteWeb = "https://google.com/";
			URL url = new URL(siteWeb);
			System.out.println("Authority : " + url.getAuthority());
			System.out.println("Default port : " + url.getDefaultPort());
			System.out.println("Host : " + url.getHost());
			System.out.println("Port : " + url.getPort());
			System.out.println("Protocol : " + url.getProtocol());

			try {
				// Nous nous connectons au site en question
				URLConnection urlConn = url.openConnection();
				System.out.println(urlConn.getContentType());

				String content = "", line = null;
				// Nous r�cup�rons un flux en retour de connexion
				BufferedReader buf = new BufferedReader(new InputStreamReader(urlConn.getInputStream()));
				// Nous stockons les informations retourn�es dans une cha�ne de caract�res
				while ((line = buf.readLine()) != null) {
					content += line + "\n";
				}

				// Nous instancions notre objet pour afficher le contenu
				Browser browser = new Browser("A", content);

				// Et nous faisons une recherche sur ce m�me site
				String result = makeSearch(siteWeb, "java");

				// Nous mettons � jour notre page
				browser.setContent(result);

				// Et nous faisons une recherche sur ce m�me site
				// result = makeSearch(siteWeb, "");

				// Nous mettons � jour notre page
				browser.setContent(result);

			} catch (IOException e) {
				e.printStackTrace();
			}

		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	public static String makeSearch(String url, String search) {

		// Une petite pause
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		String resultat = "";
		HttpURLConnection con = null;
		try {

			// Cette classe permet d'encoder les caract�res sp�ciaux
			// pour qu'ils soient interpr�tables dans une URL
			// Nous devons fournir la cha�ne � encoder et le type d'encodage, ici UTF-8
			String recherche = URLEncoder.encode("q", "UTF-8") + "=";
			recherche += URLEncoder.encode(search, "UTF-8");

			// Nous nous connectons, via un objet HTTPUrlConnection
			// � la nouvelle URL, la recherche se faisant en GET,
			// les param�tres sont dans l'URL
			System.out.println("URL de recherche : " + url + "?" + recherche);
			con = (HttpURLConnection) new URL(url + "?" + recherche).openConnection();

			// Comme la recherche pr�c�dente, nous r�cup�rons un flux que nous allons
			// stocker
			BufferedReader rd = new BufferedReader(new InputStreamReader(con.getInputStream()));
			String line;
			while ((line = rd.readLine()) != null) {
				resultat += line + "\n";
			}
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (ProtocolException e) {
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return resultat;
	}
}