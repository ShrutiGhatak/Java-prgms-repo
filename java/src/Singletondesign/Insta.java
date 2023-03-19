package Singletondesign;

 class Instapp {
int pin=1234;
static int count=0;
static Instapp I1;
private Instapp() {
	count++;
}
public static Instapp get() {
	if(count<1)
		I1=new Instapp();
	return I1;
}
public void setpin(int pin) {
	this.pin=pin;
}
}
public class Insta{
	public static void main(String[] args) {
		Instapp I2=Instapp.get();
		System.out.println(I2.pin);
		Instapp I3=Instapp.get();
		System.out.println(I3.pin);
		I3.setpin(3241);
		System.out.println(I3.pin);
	}
}
