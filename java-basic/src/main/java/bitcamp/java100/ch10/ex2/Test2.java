package bitcamp.java100.ch10.ex2;

public class Test2 {
	
	//��ø Ŭ���� = nasted class
	static class A {
		static void add() {}
	}
	//non-static nested class = inner class
	class B {
		int a;
		void add() {}
	}
	//�͸� Ŭ����
	Object obj = new Object()  {
		String name;
		public void m1() {}
	};
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//���� Ŭ����
		class C {}
		
	
	}
}
