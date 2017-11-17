
package src34;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;
import java.util.Scanner;

import src34.control.BoardController;
import src34.control.MemberController;
import src34.control.RoomController;
import src34.control.ScoreController;
import src34.domain.Controller;

public class App {

	static Scanner keyScan = new Scanner(System.in);
	static HashMap<String,Controller> controllerMap = new HashMap<>();
	
	void init() {
		controllerMap.put("/score", new ScoreController("./data/score.csv"));
		controllerMap.put("/member", new MemberController("./data/member.csv"));
		controllerMap.put("/board", new BoardController("./data/board.csv"));
		controllerMap.put("/room", new RoomController("./data/room.csv")); // OK!

	}
	void service() throws Exception {
		ServerSocket ss = new ServerSocket(9999);
		System.out.println("서버실행!");
		while (true) {
			try (
					Socket socket = ss.accept();
					BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
					PrintStream out = new PrintStream(new BufferedOutputStream(socket.getOutputStream()));
					){
				while (true) {
					String line = in.readLine();

					if(line.equals("/")) {
						hello(line, in, out);
					} else if (line.equals("quit")) {
						break;
					} else {
						request(line, out);
					}
					out.println();
					out.flush();
				} 
			} catch (Exception e) {
				e.printStackTrace();
			}
		} // while

	}
	private void request(String command, PrintStream out) {

		String menuName = command;

		int i = command.indexOf("/", 1);
		if(i != 1) {
			menuName = command.substring(0,i);
		}
		Controller controller = controllerMap.get(menuName);

		if (controller == null) {
			out.println("해당 명령을 지원하지 않습니다.");
			return;
		}
		out.println("좋은 명령입니다.^^");
		//controller.execute();

	}
	private void hello(String commend, BufferedReader in, PrintStream out) {
		out.println("안녕하세요. 성적관리 시스템 이빈다.");
		out.println("[성적관리");
		out.println("목록보기 명령 : /score/list");
		out.println("상세보기 명령 : /score/view?name=이름");
		out.println("등록 : /score/add?name=이름&kor = 점수&end = 점수&math = 점수");
		out.println("변경 : /score/update?name=이름&kor = 점수&end = 점수&math = 점수");
		out.println("삭제 : /score/delete?name=이름");
		out.println("[회원관리");
		out.println("[게시판");
		out.println("[강의실");
	}


	public static void main(String[] args) throws Exception {
		App app = new App();
		app.init();
		app.service();
	}
}




