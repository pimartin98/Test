package net;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Serveur {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {
		int port = 1000;
		ServerSocket sersoc = new ServerSocket(port);
		System.out.println("serveur active sur port :" + port);
		while (true) {
			Socket soc = sersoc.accept();
			InputStream flux = soc.getInputStream();
			BufferedReader entree = new BufferedReader(new InputStreamReader(flux));
			String message = entree.readLine();
			System.out.println("meesage recu sur le serveur = " + message);

		}

	}

}
