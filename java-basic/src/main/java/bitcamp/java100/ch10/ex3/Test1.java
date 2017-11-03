package bitcamp.java100.ch10.ex3;


public class Test1 {
	static void printList(LinkedList list) {
		for(int i = 0; i< list.size(); i++) {
			System.out.printf("%s ",list.get(i));
		}
		System.out.println();
		System.out.println("----------------------------------");
	}
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		
		list.add("È«±æµ¿");
		list.add("ÀÓ²©Á¤");
		list.add("À¯°ü¼ø");
		list.add("¾ÈÁß±Ù");
		list.add("À±ºÀ±æ");
		
		printList(list);
		
		list.insert(0, "ÀÌÃ¶Èñ");
		list.insert(0, "ÀÌÃ¶");
		list.insert(1, "asdf");
		list.insert(1, "¼º°ø");
		
		printList(list);
		
	}
}
