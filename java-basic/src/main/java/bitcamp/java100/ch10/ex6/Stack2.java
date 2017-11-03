package bitcamp.java100.ch10.ex6;

public class Stack2<T> {
	private class Box {
		T value;
		Box next ;
		
		public Box() {}
		public Box(T value) {
			this.value = value;
		}
	}
	

	Box top;
	Box bottom;
	
	int len;
	
	public void push(T value) {
		Box box = new Box(value);
		
		box.next = top;
		top = box;
		
		len++;
	}
	public int size() {
		return len;
	}

	public T pop() {
		if(len == 0) 
			return null;

		Box boxReturn = top;
		top = top.next;
		
		len--;
		
		return boxReturn.value;
	}
}

