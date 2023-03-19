package Abstraction;
interface Animal
{
	void noise();
}
class cat implements Animal{
	public void noise() {
		System.out.println("meow meow");
	}
}
class Dog implements Animal{
	public void noise() {
		System.out.println("Bow Bow");
	}
}
class snake implements Animal{
	public void noise() {
		System.out.println("Bizz Bizz");
	}
}
class Stimulator1
{
	public static void ansim(Animal a1)
	{
		a1.noise();
	}
}
public class main1 {
	public static void main(String[] args) {
		cat c1=new cat();
		Dog d1=new Dog();
		snake s1=new snake();
		Stimulator1.ansim(c1);
		Stimulator1.ansim(d1);
		Stimulator1.ansim(s1);	
	}

}
