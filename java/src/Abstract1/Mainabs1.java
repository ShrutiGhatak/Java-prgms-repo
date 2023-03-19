package Abstract1;

abstract class sample
{
	abstract void disp();
	abstract void fo();
}
abstract class Demo extends sample
{
	void disp()
	{
		System.out.println("new bakhra");
	}
	abstract void fo();
}
class Memo extends Demo
{
	void fo()
	{
		System.out.println("fofo");
	}
}
public class Mainabs1 {
	public static void main(String[] args) {
		Memo m1= new Memo();
		m1.fo();
		m1.disp();
		
	}
	

}
