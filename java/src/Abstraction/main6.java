package Abstraction;
interface colour
{
	void types();
}
class blue implements colour{
	public void types() {
		System.out.println("sky blue");
	}
}
class  pink implements colour{
	public void types() {
		System.out.println("baby pink");
	}
}
class Stimulator6
{
	public static void ansim(colour c1)
	{
		c1.types();
	}
}
public class main6 {
	public static void main(String[] args) {
		blue b1=new blue();
		pink p1=new pink();
		Stimulator6.ansim(b1);
		Stimulator6.ansim(p1);
	}

}
