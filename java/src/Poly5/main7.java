package Poly5;
class Biriyani{
	void types() {
		System.out.println("Many types");
	}
}
class Mutton extends Biriyani
{
	void types() {
		System.out.println("favourite");
	}
}
class Chicken extends Biriyani{
	void types() {
		System.out.println("also favourite");
	}
}
class egg extends Biriyani{
	void types() {
		System.out.println("good");
	}
}
class Stimulator
{
	static void ansim(Biriyani b1)
	{
		b1.types();
	}
}
public class main7 {
	public static void main(String[] args) {
		Mutton m1=new Mutton();
		Chicken c1=new Chicken();
		egg e1=new egg();
		Stimulator.ansim(m1);
		Stimulator.ansim(c1);
		Stimulator.ansim(e1);
	}

}
