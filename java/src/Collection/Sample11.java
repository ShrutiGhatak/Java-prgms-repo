package Collection;

import java.util.LinkedHashSet;

public class Sample11 {
	public static void main(String[] args) {
		LinkedHashSet l1=new HashSet();
		l1.add("Hi");
		l1.add(10.58);
		l1.add('a');
		l1.add(true);
		l1.add("Hi");
		System.out.println(l1);
		}

}
