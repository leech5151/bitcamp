package bitcamp.java100.ch10.ex3;

public class LinkedList {
	private class Box {
		Object value;
		Box next ;
	}

	Box head;
	Box tail;
	
	int len;

	public void add(Object value) {
		Box box = new Box();

		box.value = value;

		if (tail == null) {
			head = box;
			tail = box;

		}else {
			tail.next = box;
			tail = box;
		}
		len++;
	}
	public int size() {
		return len;
	}

	public Object get(int index) {
		if(index < 0 || index >= len) 
			return null;

		Box box = head;
		for(int count = 1; count <= index; count++) {
			box = box.next;
		}
		return box.value;
	}

	public void insert(int index, Object value) {
		if(index < 0 || index >= len) 
			return;
		Box pre = head;
		Box aft;
		Box inser = new Box();
		inser.value = value;
		
		if(index == 0) {
			inser.next = head;
			head = inser;
		}else {
			for(int i = 0; i < index-1; i++) 
				pre = pre.next;
			aft = pre.next;
			inser.next = aft;
			pre.next = inser;
		}
		len++;
	}
	
	public Object remove(int index) {
		if(index < 0 || index >= len) 
			return null;
		Box pre = head;
		Box aft;
		Box del = new Box();
		if(index == 0) {
			del = head;
			head = head.next;
		}else {
			for(int i = 0; i < index-1; i++) 
				pre = pre.next;
			del = pre.next;
			aft = del.next;
			pre.next = aft;
			
			if(index == len - 1){
				tail = pre;
			}
		}
		
		len--;
		return del.value;
	}
}

