package Abstraction;
interface biriyani
{
	void types();
}
class mutton implements biriyani{
	public void types() {
		System.out.println("yummy");
	}
}
class chicken implements biriyani{
	public void types() {
		System.out.println("also yummy");
	}
}
class Stimulator5
{
	public static void ansim(biriyani b1)
	{
		b1.types();
	}
}
public class main5 {
	public static void main(String[] args) {
		mutton m1=new mutton();
		chicken c1=new chicken();
		Stimulator5.ansim(m1);
		Stimulator5.ansim(c1);
	}
}
