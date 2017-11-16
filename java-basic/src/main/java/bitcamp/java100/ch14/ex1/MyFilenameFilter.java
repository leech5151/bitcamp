package bitcamp.java100.ch14.ex1;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;

public class MyFilenameFilter implements FilenameFilter {

	@Override // list() 또는 listFiles 에서 호출
	public boolean accept(File dir, String name) {
		
		File file = new File(dir, name);
		if(file.isDirectory())
			return true;
		else
			return false;
	}

}
