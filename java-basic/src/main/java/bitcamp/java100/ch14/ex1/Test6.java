package bitcamp.java100.ch14.ex1;

import java.io.File;
import java.io.FilenameFilter;
import java.sql.Date;

public class Test6 {


	public static void main(String[] args) {

		File file = new File(".");

		File[] files = file.listFiles(new FilenameFilter() {

			@Override // list() 또는 listFiles 에서 호출
			public boolean accept(File dir, String name) {

				File file = new File(dir, name);
				if(name.startsWith("."))
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
