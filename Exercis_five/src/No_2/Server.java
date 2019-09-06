package No_2;

import java.io.*;
import java.net.*;

public class Server {
	public ServerSocket svrSocket = null;
	public Socket socket = null;
	public InputStream inputStream = null;
	public OutputStream outputStream = null;
	public DataInputStream dataStream = null;
	public PrintStream printStream = null;
	public DataOutputStream dataoutputStream = null;
	public String message;
	public BufferedReader charStream = new BufferedReader(new InputStreamReader(System.in));

	public Server() {
		try {
			svrSocket = new ServerSocket(4320);
			System.out.println("\nServer>java Server");
			System.out.println("\nInitializint Port...");
			System.out.println("\nListen...");
			socket = svrSocket.accept();
			System.out.println("\nConnect to Client!\n");
			inputStream = socket.getInputStream();
			dataStream = new DataInputStream(inputStream);
			outputStream = socket.getOutputStream();
			dataoutputStream = new DataOutputStream(outputStream);

			message = dataStream.readUTF();
			System.out.print(message);
		} catch (UnknownHostException e) {
			System.out.println("Error : Cannot find server." + e);
		} catch (IOException e) {
			System.out.println("Error : I/O Error." + e);
		}
	}

	public void readSocket() {
		try {
			message = dataStream.readUTF();
			System.out.println(message);
			System.out.print("=>");
			if (message.equals("Exit")) {
				System.exit(0);
			}
		} catch (UnknownHostException e) {
			System.out.println("Error : Cannot find server." + e);
		} catch (IOException e) {
			System.out.println("Error : I/O Error." + e);
		}
	}

	public void writeSocket() {
		try {
				message = charStream.readLine();
				dataoutputStream.writeUTF(message);
			if (!message.equals("Exit"))
				return;
			else {
				dataoutputStream.writeUTF("Exit");
				System.exit(0);
			}
		} catch (UnknownHostException e) {
			System.out.println("Error : Cannot find server." + e);
		} catch (IOException e) {
			System.out.println("Error : I/O Error." + e);
		}
	}

	public static void main(String args[]) {
		Server svr = new Server();
		for (;;) {
			svr.writeSocket();
			svr.readSocket();
		}
	}
}
