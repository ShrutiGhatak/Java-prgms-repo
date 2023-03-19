package methodoverloading;

//import Methodoverloading.overload;

class sample
{
	static void add(int x,int y)
	{
		int c;
		c=x+y;
		System.out.println(c);
	}
	static void add(int x,String y)
	{
		System.out.println("Java");
	}
}
public class Main2 {
	public static void main(String[]args) {
		sample.add(2,8);
		sample.add(5,"Hi");
	 }

}
