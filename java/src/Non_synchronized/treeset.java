package Non_synchronized;
import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;
	public class treeset {
	public static void main(String[] args) {
		TreeSet t1=new TreeSet();
		
		t1.add(90);
		t1.add(30);
		t1.add(70);
		t1.add(40);
		t1.add(20);
		
		System.out.println(t1);
		
		Set s1=Collections.synchronizedSet(t1);
	}
	}
