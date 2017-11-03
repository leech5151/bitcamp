package bitcamp.java100.ch10.ex7;

import java.util.HashMap;
import java.util.Set;

public class Test10 {

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
		
		map.put("c01", new Contact("ȫ�浿1","hong@test","1111-1111"));
		map.put("c02", new Contact("ȫ�浿2","hong@test","1111-1111"));
		map.put("c03", new Contact("ȫ�浿3","hong@test","1111-1111"));
		map.put("c04", new Contact("ȫ�浿4","hong@test","1111-1111"));
		map.put("c05", new Contact("ȫ�浿4","hong@test","1111-1111"));

		Set<String> keySet = map.keySet();
		
		String[] keyList = new String[keySet.size()];
		keySet.toArray(keyList);
		
		for(String key : keyList){
			System.out.printf("%s=%s\n", key, map.get(key).toString());
		}
	}
}

