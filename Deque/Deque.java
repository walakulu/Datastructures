

package datastructures;

public class Deque {
	int head = 1;
	int tail = 1;
	int CAPACITY = 6;
	int[] D = new int[CAPACITY];
//Since we want to move two sides,I used previous() and next()
	int previous(int i) {
		if (i == 0) {
			return CAPACITY - 1;
		} else {
			return i - 1;
		}
	}

	int next(int i) {
		if (i == (CAPACITY - 1)) {
			return 0;
		} else {
			return i + 1;
		}
	}

	void insertFirst(int x) {
		if (!isFull()) {
			if (isEmpty()) {
				head = previous(head);
				D[tail] = x;
				D[head] = x;
			} else {
				head = previous(head);
				D[head] = x;
			}
		} else {
			System.out.println("Deque is overflow");

		}
	}

	String removeFirst() {
		if (!isEmpty()) {
			int temp = D[head];
			head = next(head);
			return Integer.toString(temp);

		} else {
			return "Deque is Underflow";
		}

	}

	void insertLast(int x) {
		if (!isFull()) {
			if (isEmpty()) {
				tail = next(tail);
				D[head]=x;
				D[tail]=x;
			} else {
				tail = next(tail);
				D[tail] = x;
			}
		} else {
			System.out.println("Deque is overflow");

		}
	}

	String removeLast() {
		if (!isEmpty()) {
			tail = previous(tail);
			int temp = D[tail];
			return Integer.toString(temp);
		} else {
			return "Deque is Underflow";
		}
	}

	boolean isEmpty() {
		if (head == tail) {
			return true;

		} else {
			return false;
		}

	}

	boolean isFull() {
		if (tail == previous(head)) {
			return true;
		} else {
			return false;
		}
	}
	
	int size(){
		if(head<tail){
			int size=(tail-head);
			return size;
		}else if(head==tail){
			return 0;
			
		}else{
			int size=(CAPACITY-head+tail);
			return size;
		}
	}
	String first(){
		if(isEmpty()){
			return "Deque is empty";
		}else{
		return Integer.toString(head);
		}
	}
	String last(){
		if(isEmpty()){
			return "Deque is empty";
		}else{
		return Integer.toString(tail);
		}
	}

}
