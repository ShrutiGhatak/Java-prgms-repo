package Basic;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
public class Test {
public static void main(String[] args) {
	ArrayList<Integer> l1=new ArrayList();
	l1.add(12);
	l1.add(25);
	l1.add(64);
	l1.add(56);
	l1.add(44);
	l1.add(13);
	System.out.println(l1);
	/*for(int i=0;i<l1.size();i++) {
		int x=(int)l1.get(i);
		if(x % 2 == 0)
			System.out.println(x);
	}*/
	List streams=l1.stream().filter(i -> i % 2 == 1).collect(Collectors.toList());
	System.out.println(streams);
}
}
