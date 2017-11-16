package bitcamp.java100.ch14.ex1;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.sql.Date;

public class Test12 {


	public static void main(String[] args) throws Exception {

		File file = new File(".");

		File[] files = file.listFiles();

		printFiles(file);
	}
	  static void printFiles(File dir) throws Exception {
	        File[] files = dir.listFiles();
	        String path;
	        int i;
	        for (File f : files) {
	            if (f.isFile() && f.getName().endsWith(".class")) {
	            	path = f.getCanonicalPath();
	            	i = path.indexOf("bin")+4;
	                System.out.println(path.substring(i, path.length()-6)
	                					   .replace("\\" , "."));
	            }
	            if (f.isDirectory()) {
	                printFiles(f);
	            }
	        }
	    }

}
