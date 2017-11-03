package bitcamp.java100.ch10.ex4;


public class Test1 {
	public static void main(String[] args) {
		Stack stack = new Stack();
		
		stack.push("È«±æµ¿");
		stack.push("ÀÓ²©Á¤");
		stack.push("À¯°ü¼ø");
		stack.push("¾ÈÁß±Ù");
		stack.push("À±ºÀ±æ");
		
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		
		stack.push("È«±æµ¿");
		stack.push("ÀÓ²©Á¤");
		
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
	}
}
