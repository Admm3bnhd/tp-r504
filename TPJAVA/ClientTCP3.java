import java.net.*;
import java.io.*;

public class ClientTCP3
{
	public static void main(String[] args)
	//ClientTCP3.java
	{
		try
		{
			Socket socket = new Socket("localhost",2016);
			DataOutputStream dOut = new DataOutputStream(socket.getOutputStream());
			dOut.writeUTF(args[0]);
			DataInputStream dIn = new DataInputStream(socket.getInputStream());
			System.out.println("message reversed: " + dIn.readUTF());
			socket.close();
		}
		catch(Exception ex)
		{
			System.out.println("erreur !");
			ex.printStackTrace();
		}
	}
}
