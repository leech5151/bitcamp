// File System 다루기 : File 클래스
//
package bitcamp.java100.ch14.ex1;

import java.io.File;

public class Test3 {
	public static void main(String[] args) {
		File file = new File(".");

		// list()는 단순히 파일이나 디렉토리 이름 리턴
		String[] files = file.list();

		for(String name : files) {
			System.out.println(name);
		}

	}
}

