package bitcamp.java100.ch15.ex7;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;


public class PingCilent {
	static Scanner keyboard = new Scanner(System.in);
	public static void main(String[] args) throws Exception {
		while(true) {
			Scanner keyboard = new Scanner(System.in);
			System.out.println("서버주소? ");
			String serverAddr = keyboard.nextLine();
			System.out.println("보낼메세지? ");
			String message = keyboard.nextLine();
			while(true) {
			DatagramSocket socket = new DatagramSocket();
			byte[] bytes = message.getBytes("UTF-8");
			
			InetAddress ip = InetAddress.getByName(serverAddr);
			int port = 9999;
			
			DatagramPacket packet = new DatagramPacket(bytes, 0, bytes.length, ip, port);
			
			socket.send(packet);
			socket.close();
			System.out.println("데이터 출력 완료");
			}
		}
		
	}
}
