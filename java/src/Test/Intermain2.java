package Test;
interface Demo1
{
	void test();
	void mock();
}
class New1 implements Demo1
{
	public void test()
	{
		System.out.println("testing");
	}
	public void mock() {
		System.out.println("Hello");
		
	}
}

public class Intermain2 {
	public static void main(String[] args) {
	New1 d1= new New1();
	d1.test();
	d1.mock();
}
}
