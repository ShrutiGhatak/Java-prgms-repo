package Poly6;
class Car{
	void types() {
		System.out.println("Many types");
	}
}
class Suzuki extends Car
{
	void types() {
		System.out.println("Red colour");
	}
}
class Mercedes extends Car{
	void types() {
		System.out.println("black colour");
	}
}
class Nano extends Car{
	void types() {
		System.out.println("Yellow colour");
	}
}
class Stimulator
{
	static void ansim(Car c1)
	{
		c1.types();
	}
}

public class main8 {
	public static void main(String[] args) {
		Suzuki s1=new Suzuki();
		Mercedes m1=new Mercedes();
		Nano n1=new Nano();
		Stimulator.ansim(s1);
		Stimulator.ansim(m1);
		Stimulator.ansim(n1);
	}
}
