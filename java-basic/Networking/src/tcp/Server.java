package tcp;

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
		try {
			ss = new ServerSocket(1234);
			s = ss.accept();
			dis = new DataInputStream(s.getInputStream());
			dos = new DataOutputStream(s.getOutputStream());
			while (true) {
				String text = dis.readLine();
				dos.writeBytes(text + "\n");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
