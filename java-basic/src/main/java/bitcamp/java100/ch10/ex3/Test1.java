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
		
		list.add("ȫ�浿");
		list.add("�Ӳ���");
		list.add("������");
		list.add("���߱�");
		list.add("������");
		
		printList(list);
		
		list.insert(0, "��ö��");
		list.insert(0, "��ö");
		list.insert(1, "asdf");
		list.insert(1, "����");
		
		printList(list);
		
	}
}
