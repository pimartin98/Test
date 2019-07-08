package net;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.net.URLConnection;

public class Link {

	public static void main(String[] args) throws IOException {
		// String strUrl = "http://perdu.com";
		String strUrl = "https://fr.wikipedia.org/wiki/Port_(logiciel)";
		URL url = new URL(strUrl);
		URLConnection connection = url.openConnection();
//		InputStream inputStream = null;
//		try {
//			inputStream = connection.getInputStream();
////todod
//			// } catch(...) {
//
//		} finally {
//			inputStream.close();
//		}

		// try-with-resource
		try (InputStream inputStream = connection.getInputStream()) {
			copy(inputStream, System.out);
		}
	}

	private static void copy(InputStream inputStream, OutputStream outputStream) throws IOException {
		byte[] buffer = new byte[8192];
		int read = 0;
		while ((read = inputStream.read(buffer)) >= 0) {
			outputStream.write(buffer, 0, read);
		}
	}

}
