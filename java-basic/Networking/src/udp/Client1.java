package udp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class Client1 {
	public static void main(String[] args) {
		try {
			DatagramSocket ds = new DatagramSocket(1234);
			while (true) {
				byte[] b = new byte[1024];
				DatagramPacket dp = new DatagramPacket(b, b.length);
				ds.receive(dp);
				b = dp.getData();
				String str = b.toString();
				System.out.println("Server response" + str);
				Thread.sleep(1000);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
