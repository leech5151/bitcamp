package bitcamp.java100.ch10.ex2;

public class Test2 {
	
	//중첩 클래스 = nasted class
	static class A {
		static void add() {}
	}
	//non-static nested class = inner class
	class B {
		int a;
		void add() {}
	}
	//익명 클래스
	Object obj = new Object()  {
		String name;
		public void m1() {}
	};
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//로컬 클래스
		class C {}
		
	
	}
}
