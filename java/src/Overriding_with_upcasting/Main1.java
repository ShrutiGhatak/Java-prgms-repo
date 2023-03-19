package Overriding_with_upcasting;

class sample
{
	void fo()
	{
		System.out.println("Hi");
	}
}
class demo extends sample
{
	void fo()
	{
		System.out.println("Hello");
	}
}
public class Main1 {
	public static void main(String[] args) {
		sample s1=new demo();
		s1.fo();
		
	}

}
