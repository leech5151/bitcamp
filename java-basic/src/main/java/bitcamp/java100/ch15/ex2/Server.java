package bitcamp.java100.ch15.ex2;

import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
	public static void main(String[] strings) throws Exception {
		ServerSocket ss = new ServerSocket(9999); // port 9999
		System.out.println("서버를 실행하였다!");


		Scanner keyScan = new Scanner(System.in);
		for(int i = 0; i < 10; i++) {
			Socket socket = ss.accept(); // 대기열
			System.out.println("클라이언트와 연결되었음!");
			System.out.printf("%s:%d\n",socket.getInetAddress().getHostAddress(),
										socket.getPort());
	
			ss.close();
			
			System.out.println("다음 클라이언트 : ");
			keyScan.nextLine();
		}

		System.out.println("서버를 종료하였다!");
	}
}
