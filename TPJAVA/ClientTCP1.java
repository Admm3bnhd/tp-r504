import java.net.*;
import java.io.*;

public class ClientTCP1
{
	public static void main(String[] args)
	{
	//ClientTCP1.java
	try
	{
		Socket socket = new Socket("localhost",2016);
		DataOutputStream dOut = new DataOutputStream(socket.getOutputStream());
		dOut.writeUTF("message test");
		socket.close();
	}
	catch(Exception ex)
	{
		System.out.println("erreur !");
		ex.printStackTrace();
	}
	}
}
