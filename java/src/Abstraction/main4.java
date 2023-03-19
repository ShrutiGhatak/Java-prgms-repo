package Abstraction;
interface bottles
{
	void types();
}
class plastic implements bottles{
	public void types() {
		System.out.println("not so good");
	}
}
class metal implements bottles{
	public void types() {
		System.out.println("good");
	}
}
class Stimulator4
{
	public static void ansim(bottles b1)
	{
		b1.types();
	}
}
public class main4 {
	public static void main(String[] args) {
		plastic p1=new plastic();
		metal c1=new metal();
		Stimulator4.ansim(p1);
		Stimulator4.ansim(c1);	
	}

}
