import java.net.*;
import java.io.*;

public class ServeurTCP1
{
	public static void main(String[] args)
	{
	//ServeurTCP1.java
	try
	{
		ServerSocket socketserver = new ServerSocket(2016);
		System.out.println("serveur en attente");
		Socket socket = socketserver.accept();
		System.out.println("connection d'un client");
		DataInputStream dIn = new DataInputStream(socket.getInputStream());
		System.out.println("message: " + dIn.readUTF());
	}
	catch(Exception ex)
	{
		System.out.println("erreur !");
		ex.printStackTrace();
	}
	}
}

