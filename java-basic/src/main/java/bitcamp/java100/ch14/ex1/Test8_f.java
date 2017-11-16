package bitcamp.java100.ch14.ex1;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class Test8_f {

	static ArrayList<File> fileList = new ArrayList<>();

	public static void main(String[] args) throws Exception {

		File file = new File(".");
		File[] files = file.listFiles();
		fileList.add(file);
		
		while (fileList.size() > 0) {
			printFiles(fileList.remove(0));
		}

		for(int i = 0; i < file.length(); i++) {
			System.out.println(files[i].getCanonicalPath());
			if(files[i].isDirectory() != true) {
				System.out.println("있다"); 
				
			}
			
			if(files[i].isDirectory()) {
				File[] dir = files[i].listFiles();
				for(int j = 0; j < files[i].length(); j++) {
					
				}
			}
		}
		
		//printFiles(file);
	}
	static void printFiles(File dir) throws IOException {
		File[] files = dir.listFiles();
		for(File f : files) {
			System.out.println(f.getCanonicalPath());
			if (f.isDirectory()) {
				printFiles(f);
			}
		}
	}
}
