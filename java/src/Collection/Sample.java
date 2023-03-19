package Collection;
import java.util.ArrayList;
public class Sample {
	public static void main(String[] args) {
		ArrayList l1=new ArrayList();
		l1.add(10);
		l1.add('a');
		l1.add('a');
		l1.add("java");
		l1.add(true);
		l1.add(null);
		System.out.println("Before"+l1);
		l1.add(3,'b');
		System.out.println("After"+l1);
	}

}
