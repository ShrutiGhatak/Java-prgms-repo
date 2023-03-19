package Poly3;
class Birds{
	void types() {
		System.out.println("Many types");
	}
}
class peacock extends Birds
{
	void types() {
		System.out.println("Blue");
	}
}
class Pigeon extends Birds{
	void types() {
		System.out.println("White");
	}
}
class Crow extends Birds{
	void types() {
		System.out.println("Black");
	}
}
class Stimulator
{
	static void ansim(Birds b1)
	{
		b1.types();
	}
}
public class main5 {
	public static void main(String[] args) {
		peacock p1=new peacock();
		Pigeon p2=new Pigeon();
		Crow c1=new Crow();
		Stimulator.ansim(p1);
		Stimulator.ansim(p2);
		Stimulator.ansim(c1);
	}
}
