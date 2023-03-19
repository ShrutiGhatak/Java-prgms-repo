package Encapsulation;
class ICICI_Bank{
	private int pin=1234;
	public int get() {
		return pin;
	}
	public void set(int pin) {
		this.pin=pin;
	}
}
public class Main1 {
	public static void main(String[] args) {
		ICICI_Bank I1=new ICICI_Bank();
		System.out.println(I1.get());
		I1.set(4371);
		System.out.println(I1.get());
	}

}
