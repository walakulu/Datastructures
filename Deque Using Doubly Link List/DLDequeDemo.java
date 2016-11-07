package datastructures;

public class DLDequeDemo {
	public static void main(String[] args) {
		DLDeque dl=new DLDeque();
		System.out.println("***********START OF insertFirst***********");
		dl.insertFirst(5);
		System.out.println("1st insertFirst() Call,Size :"+dl.size);
		dl.insertFirst(10);
		System.out.println("2nd insertFirst() Call,Size :"+dl.size);
		dl.insertFirst(15);
		System.out.println("3rd insertFirst() Call,Size :"+dl.size);
		dl.insertFirst(20);
		System.out.println("4th insertFirst() Call,Size :"+dl.size);
		System.out.println("***********END OF insertFirst***********");
		System.out.println("***********START OF removeFirst***********");
		System.out.println(dl.removeFirst()+"   1st removeFirst() Call,Size :"+dl.size);
		System.out.println(dl.removeFirst()+"   2nd removeFirst() Call,Size :"+dl.size);
		System.out.println(dl.removeFirst()+"   3rd removeFirst() Call,Size :"+dl.size);
		System.out.println(dl.removeFirst()+"    4thremoveFirst() Call,Size :"+dl.size);
		System.out.println("***********END OF removeFirst***********");
		System.out.println("***********START OF insetLast***********");
		dl.insertLast(5);
		System.out.println("1st Insert First,Size :"+dl.size);
		dl.insertLast(10);
		System.out.println("2nd Insert First,Size :"+dl.size);
		dl.insertLast(15);
		System.out.println("3rd Insert First,Size :"+dl.size);
		dl.insertLast(20);
		System.out.println("3rd Insert First,Size :"+dl.size);
		System.out.println("***********END OF insetLast***********");
		System.out.println("***********START OF removetLast***********");
		System.out.println(dl.removeLast()+"  1st removeLast,Size :"+dl.size);
		System.out.println(dl.removeLast()+"  2nd removeLast,Size :"+dl.size);
		System.out.println(dl.removeLast()+"  3rd removeLast,Size :"+dl.size);
		System.out.println(dl.removeLast()+"   4th removeLast,Size :"+dl.size);
		System.out.println("***********END OF removetLast***********");
		
		System.out.println("***********TEST FOR HEAD AND TAIL METHODS***********");
		System.out.println("head() method :"+dl.head());
		System.out.println("head() method :"+dl.tail());
		System.out.println("***********END OF TEST FOR HEAD AND TAIL METHODS***********");
	}

}
