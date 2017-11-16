package bitcamp.java100.ch14.ex1;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.sql.Date;

public class Test11 {


	public static void main(String[] args) throws Exception {

		File file = new File(".");

		File[] files = file.listFiles();

		printFiles(file);
	}
	static void printFiles(File dir) throws IOException {
		File[] files = dir.listFiles();
		for(File f : files) {
			if(f.isFile() && f.getName().endsWith(".class")) {
				System.out.println(f.getName());
			}
			if (f.isDirectory()) {
				printFiles(f);
			}
		}
	}
}
