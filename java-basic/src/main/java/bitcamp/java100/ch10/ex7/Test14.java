package bitcamp.java100.ch10.ex7;

import java.util.HashSet;
import java.util.Iterator;

public class Test14 {


	public static void main(String[] args) {

		HashSet<String> set = new HashSet<>();

		set.add("ȫ�浿");
		set.add("�Ӳ���");
		set.add("������");

		Iterator<String> iterator = set.iterator();
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
	}


}

