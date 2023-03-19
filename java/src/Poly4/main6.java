package Poly4;
class Bottles{
	void types() {
		System.out.println("Many types");
	}
}
class plastic extends Bottles
{
	void types() {
		System.out.println("not so good");
	}
}
class metal extends Bottles{
	void types() {
		System.out.println("good");
	}
}
class glass extends Bottles{
	void types() {
		System.out.println("medium");
	}
}
class Stimulator
{
	static void ansim(Bottles b1)
	{
		b1.types();
	}
}
public class main6 {
	public static void main(String[] args) {
		plastic p1=new plastic();
		metal p2=new metal();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		glass c1=new glass();
		Stimulator.ansim(p1);
		Stimulator.ansim(p2);
		Stimulator.ansim(c1);
	}

}
