package bitcamp.java100.ch10.ex7;

import java.util.ArrayList;
import java.util.Iterator;

public class Test13 {

	static class Contact{
		String name;
		String email;
		String tel;
		
		public Contact(String name, String email, String tel) {
			this.name = name;
			this.email = email;
			this.tel = tel;
		}

		@Override
		public String toString() {
			return "Contact [name=" + name + ", email=" + email + ", tel=" + tel + "]";
		}
	}
	
	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<>();
		
		list.add("ȫ�浿");
		list.add("�Ӳ���");
		list.add("������");

		Iterator<String> iterator = list.iterator();
		
		while(iterator.hasNext()) {
			System.out.printf("%s\n",iterator.next());
		}
	}
}

