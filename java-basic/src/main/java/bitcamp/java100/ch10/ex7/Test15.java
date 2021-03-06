package bitcamp.java100.ch10.ex7;

import java.util.HashMap;
import java.util.Iterator;

public class Test15 {

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

		HashMap<String,Contact> map = new HashMap<>();

		Contact c1 = new Contact("ȫ�浿","hong@test","1111-1111");
		Contact c2 = new Contact("ȫ�浿","hong2@test","1111-1112");
		Contact c3 = new Contact("ȫ�浿","hong3@test","1111-1113");
		
		map.put("aaa", c1);
		map.put("bbb", c2);
		map.put("ccc", c3);

		Iterator<Contact> iterator = map.values().iterator();
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
	}
}

