package POJOTOPIC;
import java.util.ArrayList;
public class Main1 {
	
		public static void main(String[] args) {
			Employee1 e1=new Employee1(1, "Dinga", 60000.00);
			ArrayList<Employee1> e2 = new ArrayList<Employee1>() ;
			e2.add(e1);
			e2.add(e1);
			System.out.println(e2);
		}

	}

