package bitcamp.java100.ch10.ex5;


public class Test1 {
	public static void main(String[] args) {
		Queue queue = new Queue();
		
		queue.add("ȫ�浿");
		queue.add("�Ӳ���");
		queue.add("������");
		queue.add("���߱�");
		queue.add("������");
		
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		
		queue.add("���߱�");
		queue.add("������");
		
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
	}
}
