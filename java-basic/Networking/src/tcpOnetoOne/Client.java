package tcpOnetoOne;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;

public class Client {
	public static void main(String[] args) {
		Socket s = null;
		DataInputStream dis = null;
		DataOutputStream dos = null;
		DataInputStream kb = null;
		try {
			s = new Socket("localhost", 1234);
			dis = new DataInputStream(s.getInputStream());
			dos = new DataOutputStream(s.getOutputStream());
			kb = new DataInputStream(System.in);
			while (true) {
				System.out.println("Enter input");
				String input = kb.readLine();
				dos.writeBytes(input + "\n");
				String reply = dis.readLine();
				System.out.println("Message : " + reply);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
