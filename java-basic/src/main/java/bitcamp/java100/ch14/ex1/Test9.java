package bitcamp.java100.ch14.ex1;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.sql.Date;

public class Test9 {


	public static void main(String[] args) throws Exception {

		File file = new File(".");


		printFiles(file);
	}
	static void printFiles(File dir) throws IOException {
		File[] files = dir.listFiles();
		for(File f : files) {
			System.out.println(f.getCanonicalPath());
//			if (f.isDirectory()) {
//				printFiles(f);
//			}
		}
	}
	
	
}
