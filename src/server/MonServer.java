package server;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class MonServer {

	public static void main(String[] args) throws Exception {
		ServerSocket ss = new ServerSocket(1234) ;
		System.out.println("J'attend la connexion ...") ;
		Socket s = ss.accept();
		System.out.println("Connexion d'un client " + s.getReuseAddress());
		InputStream is = s.getInputStream();
		OutputStream os = s.getOutputStream();
		System.out.println("J'attend que le client envoie un octet");
		
		int nb = is.read();
		System.out.println("J'ain reçu un nombre ! " + nb) ;
		int res = nb * 12 ;
		System.out.println("J'envoie la réponse !" + res) ;
		os.write(res);
		s.close();
		
		
		 

	}

}
