package Collection;

import java.util.LinkedList;

public class Sample8 {
	public static void main(String[] args) {
		LinkedList l1=new LinkedList();
		l1.add("Java");
		l1.add('a');
		l1.add(10);
		l1.add(true);
		l1.add(10.56);
		l1.add(null);
		System.out.println(l1.peek());
		System.out.println(l1);
		System.out.println(l1.poll());
		System.out.println(l1);
		}

}
