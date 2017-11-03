package bitcamp.java100.ch10.ex7;

import java.util.ArrayList;

public class Test1 {


	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<>();

		list.add(new String("È«±æµ¿"));
		list.add(new String("ÀÓ²©Á¤"));
		list.add(new String("À¯°ü¼ø"));

		System.out.println(list.size());

		for(int i = 0; i < list.size(); i++) {
			System.out.printf("%s ",list.get(i));
		}
		System.out.println();
		
		for (String s : list) {
			System.out.printf("%s ", s);
		}
	}
}
