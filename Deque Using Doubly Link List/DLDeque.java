package datastructures;

public class DLDeque {
	DLNode head = null;
	DLNode tail = null;
	static int size = 0;

	void insertFirst(int x) {
		DLNode dl = new DLNode();
		size++;
		dl.data = x;
		if (head == null) {
			head = tail = dl;
		} else {
			head.previous = dl;
			dl.next = head;
			head = dl;

		}
	}
	String removeFirst() {
		if (head == null) {
			return "Deque is underflow";
		} else if (head == tail) {
			int temp = head.data;
			head = tail = null;
			size = 0;
			return Integer.toString(temp);
		} else {
			int temp = head.data;
			head = head.next;
			head.previous = null;
			size++;
			return Integer.toString(temp);
		}
	}

	void insertLast(int x) {
		DLNode dl = new DLNode();
		size++;
		dl.data = x;
		if (head == null) {
			head = tail = dl;
		} else {
			tail.next = dl;
			dl.previous = tail;
			tail = dl;

		}
	}

	String removeLast() {
		if (head == null) {
			return "Deque is underflow";
		} else if (head == tail) {
			int temp = head.data;
			head = tail = null;
			size = 0;
			return Integer.toString(temp);
		} else {
			int temp = tail.data;
			tail = tail.previous;
			tail.next = null;
			size++;
			return Integer.toString(temp);
		}
	}
	boolean isEmpty() {

		if (head == null) {
			return true;
		} else {
			return false;
		}
	}
	int size() {
		return size;
	}
	String head(){
		if(!isEmpty()){
			return Integer.toString(head.data) ;
		}else{
			return "Deque is Underflow";
		}
	}
	String tail(){
		if(!isEmpty()){
			return Integer.toString(tail.data) ;
		}else{
			return "Deque is Underflow";
		}
	}
}
