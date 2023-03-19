package Collection;

import java.util.ArrayList;

public class Sample6 {
public static void main(String[] args) {
		
		ArrayList l1=new ArrayList();
		l1.add("Hello");
		l1.add(1);
		l1.add('b');
		System.out.println(l1);
		for(int i=0;i<l1.size();i++)
		{
			System.out.println(l1.get(i));
		}
		}

}
