package bitcamp.java100.ch12.ex3;

public interface Protocol1 {
	void m1();
	
	abstract void m2();
	
	public abstract void m3(); 
	
	void m4(); // m1 == m2 == m3 == m4 모두 추상 메서드
	
	
}
