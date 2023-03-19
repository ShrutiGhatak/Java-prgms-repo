package Poly2;
class Mobile{
	void types() {
		System.out.println("Many types");
	}
}
class Redmi extends Mobile
{
	void types() {
		System.out.println("Redmi Note 8 pro");
	}
}
class Samsung extends Mobile{
	void types() {
		System.out.println("Samsung Galaxy");
	}
}
class Realme extends Mobile{
	void types() {
		System.out.println("Realme c2");
	}
}
class Stimulator
{
	static void ansim(Mobile m1)
	{
		m1.types();
	}
}
public class main4 {
	public static void main(String[] args) {
		Redmi r1=new Redmi();
		Samsung s1=new Samsung();
		Realme t1=new Realme();
		Stimulator.ansim(r1);
		Stimulator.ansim(s1);
		Stimulator.ansim(t1);

}
}	
