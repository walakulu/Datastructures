/**
 * This is the demonstration class of all the important method in the deque 
 * */

package datastructures;

public class DequeDemo {
	public static void main(String[] args) {
		Deque d = new Deque();
		System.out.println("*********INIT POINT*************");
		System.out.println("Head :" + d.head + "  Tail:" + d.tail);
		System.out.println("IS FILL :" + d.isFull());
		System.out.println("IS EMPTY :" + d.isEmpty());
		System.out.println("SIZE :"+d.size());
		System.out.println("*********END INIT POINT*************");

		System.out.println("*********INSERT FROM insertFirst*************");
		d.insertFirst(5);
		System.out.println("Head :" + d.head + "  Tail:" + d.tail);
		System.out.println("SIZE :"+d.size());
		d.insertFirst(10);
		System.out.println("Head :" + d.head + "  Tail:" + d.tail);
		System.out.println("SIZE :"+d.size());
		d.insertFirst(15);
		System.out.println("Head :" + d.head + "  Tail:" + d.tail);
		System.out.println("SIZE :"+d.size());
		d.insertFirst(20);
		System.out.println("Head :" + d.head + "  Tail:" + d.tail);
		System.out.println("SIZE :"+d.size());
		d.insertFirst(25);
		System.out.println("Head :" + d.head + "  Tail:" + d.tail);
		System.out.println("SIZE :"+d.size());
		System.out.println("IS FILL :" + d.isFull());
		System.out.println("*********END OF INSERT FROM insertFirst*************");

		System.out.println("*********DELETE FROM removeFirst*************");
		System.out.println(d.removeFirst());
		System.out.println("Head :" + d.head + "  Tail:" + d.tail);
		System.out.println("SIZE :"+d.size());
		System.out.println(d.removeFirst());
		System.out.println("Head :" + d.head + "  Tail:" + d.tail);
		System.out.println("SIZE :"+d.size());
		System.out.println(d.removeFirst());
		System.out.println("Head :" + d.head + "  Tail:" + d.tail);
		System.out.println("SIZE :"+d.size());
		System.out.println(d.removeFirst());
		System.out.println("Head :" + d.head + "  Tail:" + d.tail);
		System.out.println("SIZE :"+d.size());
		System.out.println(d.removeFirst());
		System.out.println("Head :" + d.head + "  Tail:" + d.tail);
		System.out.println("SIZE :"+d.size());
		System.out.println("IS EMPTY :" + d.isEmpty());
		System.out.println("*********END OF DELETE FROM removeFirst*************");

		System.out.println("*********INSERT FROM insertLast*************");
		d.insertLast(5);
		System.out.println("Head :" + d.head + "  Tail:" + d.tail);
		System.out.println("SIZE :"+d.size());
		d.insertLast(10);
		System.out.println("Head :" + d.head + "  Tail:" + d.tail);
		System.out.println("SIZE :"+d.size());
		d.insertLast(15);
		System.out.println("Head :" + d.head + "  Tail:" + d.tail);
		System.out.println("SIZE :"+d.size());
		d.insertLast(20);
		System.out.println("Head :" + d.head + "  Tail:" + d.tail);
		System.out.println("SIZE :"+d.size());
		d.insertLast(25);
		System.out.println("Head :" + d.head + "  Tail:" + d.tail);
		System.out.println("SIZE :"+d.size());
		System.out.println("IS FILL :" + d.isFull());
		System.out.println("*********END OF INSERT FROM insertLast*************");

		System.out.println("*********DELETE FROM removeLast*************");
		System.out.println(d.removeLast());
		System.out.println("Head :" + d.head + "  Tail:" + d.tail);
		System.out.println("SIZE :"+d.size());
		System.out.println(d.removeLast());
		System.out.println("Head :" + d.head + "  Tail:" + d.tail);
		System.out.println("SIZE :"+d.size());
		System.out.println(d.removeLast());
		System.out.println("Head :" + d.head + "  Tail:" + d.tail);
		System.out.println("SIZE :"+d.size());
		System.out.println(d.removeLast());
		System.out.println("Head :" + d.head + "  Tail:" + d.tail);
		System.out.println("SIZE :"+d.size());
		System.out.println(d.removeLast());
		System.out.println("Head :" + d.head + "  Tail:" + d.tail);
		System.out.println("SIZE :"+d.size());
		System.out.println("IS EMPTY :" + d.isEmpty());
		System.out.println("*********END OF DELETE FROM removeLast*************");

	}

}
