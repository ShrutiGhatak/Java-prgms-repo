package Prgm;
class Instagram{
	int pin=1234;
	static int count=0;
	static Instagram I1;
	private Instagram() {
		count++;
	}
	public static Instagram get() {
		if(count < 1) {
			I1=new Instagram();
		}
		return I1;
	}
	public void setpin(int pin) {
		this.pin=pin;
	}
}
public class InstagramApp {
	public static void main(String[] args) {
		Instagram I2=Instagram.get();
		System.out.println(I2.pin);
		Instagram I3=Instagram.get();
		System.out.println(I3.pin);
		I3.setpin(4321);
		System.out.println(I3.pin);
		Instagram I4=Instagram.get();
		I4.setpin(5678);
		System.out.println(I4.pin);
	}

}
