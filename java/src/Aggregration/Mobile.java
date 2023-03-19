package Aggregration;

public class Mobile {
String name;
String model;
double price;
Sim s;//Aggregration

public Mobile(String name, String model, double price, Sim s) {
	this.name = name;
	this.model = model;
	this.price = price;
	this.s = s;
}

@Override
public String toString() {
	return "Mobile [name=" + name + ", model=" + model + ", price=" + price + ", s=" + s + "]";
}

/*public void display() {
	System.out.println("-----------------------------");
	System.out.println("The mob name is-"+name);
	System.out.println("The mob model is-"+model);
	System.out.println("The sim type is-"+s.type);
	System.out.println("The sim provider is-"+s.provider);
	System.out.println("---------------------------------");
}*/
public static void main(String[] args) {
	Sim a1=new Sim("4G","JIO");
	Mobile e1=new Mobile("Redmi","Note 8 Pro",66666666,a1);
	System.out.println(e1);
	//e1.display();
}
}


