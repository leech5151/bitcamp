package bitcamp.java100.ch15.ex7;

import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;
import java.util.Scanner;

public class MulticastClient {
	static Scanner keyboard = new Scanner(System.in);
	public static void main(String[] args) throws Exception {
		
		
		while(true) {
			Scanner keyboard = new Scanner(System.in);
			MulticastSocket socket = new MulticastSocket();
			InetAddress ip = InetAddress.getByName("238.1.2.3");
			int port = 9999;
			
			while(true) {
			System.out.println("보낼메세지? ");
			String message = keyboard.nextLine();
			
			if(message.equals("quit")) break;
			
			byte[] bytes = message.getBytes("UTF-8");
			DatagramPacket packet = new DatagramPacket(bytes, 0, bytes.length, ip, port);
			socket.send(packet);
			System.out.println("데이터 출력 완료");
			}
			
			socket.close();
			keyboard.close();
		}
		
	}
}

