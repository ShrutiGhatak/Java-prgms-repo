package Collection;

import java.util.PriorityQueue;

public class Sample9 {
	public static void main(String[] args) {
		PriorityQueue l1=new PriorityQueue();
		l1.add(1);
		l1.add(2);
		l1.add(3);
		l1.add(4);
		l1.add(5);
		System.out.println(l1.peek());
		System.out.println(l1);
		System.out.println(l1.poll());
		System.out.println(l1);
		}

}
