package bitcamp.java100.ch14.ex1;

import java.io.File;
import java.io.FileFilter;
import java.sql.Date;

public class Test7 {


	public static void main(String[] args) {

		File file = new File(".");

		File[] files = file.listFiles(new FileFilter() {

			@Override // list() 또는 listFiles 에서 호출
			public boolean accept(File pathname) {
				if(pathname.getName().startsWith("."))
					return false;
				else
					return true;
			}
		});

		for(File f : files) {
			System.out.printf("%s %5d %s %s\n",
							f.isDirectory() ? "d" : "-",
							f.length(),
							new Date(f.lastModified()).toString(),
							f.getName());
		}

	}
}
