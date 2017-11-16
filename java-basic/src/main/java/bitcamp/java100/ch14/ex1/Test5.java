package bitcamp.java100.ch14.ex1;

import java.io.File;
import java.io.FilenameFilter;

public class Test5 {


	public static void main(String[] args) {

		File file = new File(".");

		String[] filenames = file.list(new FilenameFilter() {

			@Override // list() 또는 listFiles 에서 호출
			public boolean accept(File dir, String name) {

				File file = new File(dir, name);
				if(name.startsWith("dir"))
					return false;
				else
					return true;
			}
		});

		for(String name : filenames) {
			System.out.println(name);
		}

	}
}
