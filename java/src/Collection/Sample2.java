package Collection;

import java.util.ArrayList;

public class Sample2 {
	public static void main(String[] args) {
		
		ArrayList l1=new ArrayList();
		l1.add("Hello");
		l1.add(1);
		l1.add('b');
		System.out.println(l1);
		ArrayList l2= new ArrayList();
		l2.add("Bye");
		l2.add(2);
		l2.add('c');
		System.out.println(l2);
		l1.addAll(2,l2);
		//System.out.println(l2);
		System.out.println("After"+l1);
		}

}