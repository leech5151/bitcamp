package bitcamp.java100.ch14.ex1;

import java.io.File;
import java.sql.Date;

public class Test4 {
	public static void main(String[] args) {
		File file = new File(".");

		// listFiles() 는 자세한 파일이나 디렉토리 이름과 정보 리턴
		File[] files = file.listFiles();

		for(File f : files) {
			System.out.printf("%s %5d %s %s\n",
							f.isDirectory() ? "d" : "-",
							f.length(),
							new Date(f.lastModified()).toString(),
							f.getName());
		}

	}
}
