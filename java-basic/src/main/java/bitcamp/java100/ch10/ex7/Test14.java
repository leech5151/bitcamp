package bitcamp.java100.ch10.ex7;

import java.util.HashSet;
import java.util.Iterator;

public class Test14 {


	public static void main(String[] args) {

		HashSet<String> set = new HashSet<>();

		set.add("È«±æµ¿");
		set.add("ÀÓ²©Á¤");
		set.add("À¯°ü¼ø");

		Iterator<String> iterator = set.iterator();
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
	}


}

