package Abstraction;
interface mobile
{
	void types();
}
class redmi implements mobile{
	public void types() {
		System.out.println("Redmi note 8 pro");
	}
}
class samsung implements mobile{
	public void types() {
		System.out.println("Samsung Galaxy");
	}
}
class Stimulator2
{
	public static void ansim(mobile m1)
	{
		m1.types();
	}
}
public class main2 {
	public static void main(String[] args) {
		redmi r1=new redmi();
		samsung s1=new samsung();
		Stimulator2.ansim(r1);
		Stimulator2.ansim(s1);	
	}
}
