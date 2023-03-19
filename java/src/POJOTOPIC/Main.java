package POJOTOPIC;

public class Main {
	public static void main(String[] args) {
		Employee e1=new Employee();
		e1.setId(1);
		e1.setName("TOM");
		e1.setSalary(52345);
		System.out.println(e1.getId());
		System.out.println(e1.getName());
		System.out.println(e1.getSalary());
		System.out.println("----------------------");
		e1.id=2;
		e1.name="Jerry";
		e1.salary=32456;
		System.out.println(e1.getId());
		System.out.println(e1.getName());
		System.out.println(e1.getSalary());
	}

}
