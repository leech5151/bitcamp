package bitcamp.java100.ch10.ex7;

import java.util.HashSet;

public class Test3 {


	public static void main(String[] args) {

		HashSet<String> set = new HashSet<>();

		String s1 = "��ȫ�浿";
		String s2 = "���Ӳ���";
		String s3 = "��������";

		set.add(s1);
		set.add(s2);
		set.add(s3);

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

