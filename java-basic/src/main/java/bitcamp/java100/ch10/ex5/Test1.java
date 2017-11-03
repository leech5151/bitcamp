package bitcamp.java100.ch10.ex5;


public class Test1 {
	public static void main(String[] args) {
		Queue queue = new Queue();
		
		queue.add("È«±æµ¿");
		queue.add("ÀÓ²©Á¤");
		queue.add("À¯°ü¼ø");
		queue.add("¾ÈÁß±Ù");
		queue.add("À±ºÀ±æ");
		
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		
		queue.add("¾ÈÁß±Ù");
		queue.add("À±ºÀ±æ");
		
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
	}
}
