package Aggregration;

public class Employee {
	int id;
	String name;
	Address address;//Aggregration
	public Employee(int id, String name, Address address) {
		this.id = id;
		this.name = name;
		this.address = address;
	}
	public void display() {
		System.out.println("-----------------------------");
		System.out.println("The emp id is-"+id);
		System.out.println("The emp name is-"+name);
		System.out.println("The emp address is-"+address.state);
		System.out.println("The emp address is-"+address.city);
		System.out.println("The emp address is-"+address.pin);
		System.out.println("---------------------------------");
	}
	public static void main(String[] args) {
		Address a1=new Address("WB","Kolkata",876554);
		Employee e1=new Employee(1,"Dinga",a1);
		e1.display();
	}

}
