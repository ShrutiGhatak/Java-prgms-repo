package Collection;

import java.util.ArrayList;

public class Sample3 {
	public static void main(String[] args) {
		
		ArrayList l1=new ArrayList();
		l1.add("Hello");
		l1.add(1);
		l1.add(1);
		l1.add('b');
		System.out.println("Before"+l1);
		//ArrayList l2= new ArrayList();
		l1.remove(1);
		System.out.println("After"+l1);
		l1.remove(0);
		//System.out.println(l2);
		System.out.println("After Index"+l1);
		}

}
