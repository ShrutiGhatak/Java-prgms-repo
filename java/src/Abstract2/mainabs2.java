package Abstract2;
abstract class Banana
{
	abstract void banana();
	abstract void chotabanana();
}
 class BothBanana extends Banana
{
	void banana()
	{
		System.out.println("This is banana");
	}
	void chotabanana()
	{
		System.out.println("This is chotabanana");
	}
}
public class mainabs2 {
	public static void main(String[] args) {
		BothBanana b1=new BothBanana();
		b1.banana();
		b1.chotabanana();
	}

}
