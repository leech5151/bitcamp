package bitcamp.java100.ch14.ex2;

import java.io.File;
import java.io.FileOutputStream;

public class Test2_0 {
	public static void main(String[] args) throws Exception {
		File file = new File("./test.dat");
		
		// 1. 바이트 단위로 데이터를 출력하는 객체 준비
		FileOutputStream out = new FileOutputStream(file);
		
		// 2. 바이트 단위로 데이터를 출력
		int[] data = {0x66554420,0x66554421,0x66554421,
				0x66554422,0x66554423,0x66554424,
				0x66554425,0x66554426,0x66554427,0x66554428,0x66554429};
		for(int b : data) {
			System.out.println(Integer.toHexString(b));
			out.write(b);
		}
		// 3. 자원해제
		out.close();
	}
}
