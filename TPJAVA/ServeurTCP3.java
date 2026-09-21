import java.net.*;
import java.io.*;

public class ServeurTCP3
{
	public static void main(String[] args)
	//ServeurTCP3.java
	{
		try
		{	
			ServerSocket socketserver = new ServerSocket(2016);
			System.out.println("serveur en attente");
			while(true)
			{
				Socket socket = socketserver.accept();
				System.out.println("connection d'un client");
				DataInputStream dIn = new DataInputStream(socket.getInputStream());
				String msg = dIn.readUTF();
				System.out.println("message: " + msg);
				String rev = new StringBuilder(msg).reverse().toString();
				DataOutputStream dOut = new DataOutputStream(socket.getOutputStream());
				dOut.writeUTF(rev);
			}
		}
		catch(Exception ex)
		{
			System.out.println("erreur !");
			ex.printStackTrace();
		}
	}
}

