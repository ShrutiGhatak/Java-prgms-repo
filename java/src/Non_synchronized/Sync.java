package Non_synchronized;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class Sync {
		public static void main(String[] args) {
			ArrayList a1=new ArrayList();
			
			a1.add(10);
			a1.add("hello");
			a1.add('A');
			a1.add(20.56);
			a1.add(null);
			System.out.println(a1);
			
			List l1= Collections.synchronizedList(a1);
			System.out.println(l1);
			
		}
}
