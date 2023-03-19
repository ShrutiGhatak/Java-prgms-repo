package Abstraction;
interface birds
{
	void types();
}
class peacock implements birds{
	public void types() {
		System.out.println("blue");
	}
}
class crow implements birds{
	public void types() {
		System.out.println("black");
	}
}
class Stimulator3
{
	public static void ansim(birds b1)
	{
		b1.types();
	}
}
public class main3 {
	public static void main(String[] args) {
		peacock p1=new peacock();
		crow c1=new crow();
		Stimulator3.ansim(p1);
		Stimulator3.ansim(c1);	
	}

}
