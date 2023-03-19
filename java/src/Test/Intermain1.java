package Test;
interface sample
{
	void fo();
	void mo();
}
abstract class Demo implements sample
{
	public void fo()
	{
		System.out.println("fofo");
	}
	public abstract void mo();
}
class memo extends Demo
{
	public void mo()
	{
		System.out.println("momo");
	}
}
public class Intermain1 {
	public static void main(String[] args) {
		memo m1=new memo();
		m1.fo();
		m1.mo();
		
	}

}
