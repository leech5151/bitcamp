package bitcamp.java100.ch13.ex5;

import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		Scanner keyScan = new Scanner(System.in);
		System.out.print("입력> ");
		String str = keyScan.nextLine().toLowerCase();
		
		try {
			// try 예외발생 할 만한 코드
			System.out.println("try 블록 실행");
			if(str.equals("y")) {
				throw new Exception();
			}
			System.out.println(str);
		} catch(Exception e) {
			// catch 예외발생 시 실행 코드
			System.out.println("catch 블록 실행");
		}
	}
}
