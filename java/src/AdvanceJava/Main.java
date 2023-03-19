package AdvanceJava;

public class Main {
	public static void main(String[] args) {
		demo1 d=new demo1();
		d.send();
		System.out.println(d.b);
		//OOs1.display();
		//System.out.println(OOs1.x);
		System.out.println(demo1.a.x);
		demo1.a.display("Hi");
		demo1.a.display(10);
		System.out.println("-----------");
		demo1.a.x=223;
		System.out.println(demo1.b.x);
	}

}
