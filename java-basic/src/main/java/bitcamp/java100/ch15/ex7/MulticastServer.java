package bitcamp.java100.ch15.ex7;

import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;
import java.util.Scanner;

public class MulticastServer {
	public static void main(String[] args) throws Exception {
		Scanner keyboard = new Scanner(System.in);
		MulticastSocket socket = new MulticastSocket(9999);
		InetAddress groupAddr = InetAddress.getByName("238.1.2.3");
		socket.joinGroup(groupAddr);
		
		byte[] buf = new byte[1024];
		DatagramPacket packet = new DatagramPacket(buf, buf.length);
		while(true){
			System.out.println("데이터를 기다리는중...");
			socket.receive(packet);

			String message = new String(packet.getData(), 0, packet.getLength(),"UTF-8");

			System.out.printf("[%s:%d] %s\n", 
					packet.getAddress().getHostAddress(),
					packet.getPort(),
					message);
			System.out.println("------------------------------------------------");
		}
		//socket.close();
	}
}
