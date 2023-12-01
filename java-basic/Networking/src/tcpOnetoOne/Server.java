package tcpOnetoOne;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	public static void main(String[] args) {
		ServerSocket ss = null;
		Socket s = null;
		DataInputStream dis = null;
		DataOutputStream dos = null;
		DataInputStream kb = null;
		try {
			ss = new ServerSocket(1234);
			s = ss.accept();
			dis = new DataInputStream(s.getInputStream());
			dos = new DataOutputStream(s.getOutputStream());
			kb = new DataInputStream(System.in);
			while (true) {
				System.out.println("Waiting for message");
				String text = dis.readLine();
				System.out.println("Message : " + text);
				System.out.println("Enter input");
				String input = kb.readLine();
				dos.writeBytes(input + "\n");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
