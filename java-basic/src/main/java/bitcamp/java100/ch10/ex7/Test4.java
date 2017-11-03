package bitcamp.java100.ch10.ex7;

import java.util.HashSet;

public class Test4 {

	
	public static void main(String[] args) {

		HashSet<String> set = new HashSet<>();

		String s1 = "È«±æµ¿";
		String s2 = "ÀÓ²©Á¤";
		String s3 = "À¯°ü¼ø";

		set.add(s1);
		set.add(s2);
		set.add(s3);

		String s4 = new String("È«±æµ¿");
		String s5 = new String("È«±æµ¿");
		
		System.out.println(s1 == s4);
		System.out.println(s1 == s5);
		System.out.println(s4 == s5);
		
		System.out.println(s1.hashCode());
		System.out.println(s4.hashCode());
		System.out.println(s5.hashCode());
		
		System.out.println(s1.equals(s4));
		System.out.println(s1.equals(s5));
		System.out.println(s4.equals(s5));
		
		set.add(s1);
		set.add(s2);
		set.add(s3);

		set.add(null);
		set.add(null);

		System.out.println(set.size());

		String[] arr = new String[set.size()];
		String[] arr2 = set.toArray(arr);

		if(arr == arr2) {
			System.out.println("arr == arr2");

		}else
		{
			System.out.println("arr != arr2");
		}
		for(String s : arr) {
			System.out.printf(" %s", s);
		}
		System.out.println();
	}


}

