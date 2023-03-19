package Collection;

import java.util.Vector;

public class Sample7 {
	public static void main(String[] args) {
	Vector l1=new Vector();
	l1.add("Java");
	l1.add('a');
	l1.add(10);
	l1.add(true);
	l1.add(10.56);
	l1.add(null);
	System.out.println(l1.capacity());
	System.out.println(l1);
	}

}
