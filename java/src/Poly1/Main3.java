package Poly1;
class Animal{
	void noise() {
		System.out.println("Some noise");
	}
}
class Cat extends Animal
{
	void noise() {
		System.out.println("meow-meow");
	}
}
class Dog extends Animal{
	void noise() {
		System.out.println("Bow-Bow");
	}
}
class Snake extends Animal{
	void noise() {
		System.out.println("Buzz-Buzz");
	}
}
class Stimulator
{
	static void ansim(Animal a1)
	{
		a1.noise();
	}
}
public class Main3 {
	public static void main(String[] args) {
		Cat c1=new Cat();
		Dog d1=new Dog();
		Snake s1=new Snake();
		Stimulator.ansim(c1);
		Stimulator.ansim(d1);
		Stimulator.ansim(s1);
	}

}
