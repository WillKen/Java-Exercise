package No_2;

import java.net.*;
import java.io.*;

public class Client extends Thread{
	
	@SuppressWarnings("resource")
	public void run() {
		OutputStream outputStream = null;
		DataOutputStream dataoutputStream = null;
		InputStream inputStream = null;
		DataInputStream dataStream = null;
		BufferedReader charStream = null;

		// Initialize Socket
		Socket socket = null;
		String message;

		try {
			charStream = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Client>java Client\n");
			message = new String("=>");
			socket = new Socket("127.0.0.1", 4320);
			dataStream = new DataInputStream(inputStream);
			outputStream = socket.getOutputStream();
			dataoutputStream = new DataOutputStream(outputStream);
			dataoutputStream.writeUTF(message);
		} catch (UnknownHostException e) {
			System.out.println("Error : Cannot find server." + e);
		} catch (IOException e) {
			System.out.println("Error : I/O Error." + e);
		}
		
		while (true) {
			try {
				inputStream = socket.getInputStream();
				dataStream = new DataInputStream(inputStream);
				message = dataStream.readUTF();
				System.out.println(message);
				System.out.print("=>");
				if (message.equals("Exit")) {
					System.exit(0);
				}
				message = charStream.readLine();
				dataoutputStream.writeUTF(message);
			} catch (UnknownHostException e) {
				System.out.println("Error : Cannot find server." + e);
			} catch (IOException e) {
				System.out.println("Error : I/O Error." + e);
			}
		}
	}
	
	public static void main(String args[]){
		Client c1 = new Client();
		c1.start();
		
	} 
} 