package bitcamp.java100.ch10.ex4;


public class Test1 {
	public static void main(String[] args) {
		Stack stack = new Stack();
		
		stack.push("ȫ�浿");
		stack.push("�Ӳ���");
		stack.push("������");
		stack.push("���߱�");
		stack.push("������");
		
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		
		stack.push("ȫ�浿");
		stack.push("�Ӳ���");
		
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
	}
}
