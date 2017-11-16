package bitcamp.java100.ch14.ex1;

import java.io.File;
import java.io.FilenameFilter;

public class MyFilenameFilter2 implements FilenameFilter {

	@Override // list() 또는 listFiles 에서 호출
	public boolean accept(File dir, String name) {
		
		try {
			// getCanonicalPath() 계산된 경로
			System.out.print(dir.getCanonicalPath() + ",");
			System.out.println(name);
		} catch (Exception e) {
			
		}
		// true를 리턴하면 그 파일을 리턴배열에 포함 o
		// false를 리턴하면 그 파일을 리턴배열에 포함 x
		
		return true;
	}

}
